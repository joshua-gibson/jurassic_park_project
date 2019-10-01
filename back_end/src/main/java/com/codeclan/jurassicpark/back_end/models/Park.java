package com.codeclan.jurassicpark.back_end.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="parks")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private int capacity;

    @Column(name="park_paddock_capacity")
    private int parkPaddockCapacity = 3;

    @JsonIgnore
    @OneToMany(mappedBy = "park", fetch = FetchType.LAZY)
    private List<Paddock> paddocks;

    public Park(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.paddocks = new ArrayList<>();
    }

    public Park() {
    }

    public List<Paddock> getPaddock() {
        return paddocks;
    }

    public void setPaddock(List<Paddock> paddock) {
        this.paddocks = paddock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int parkPaddockCapacity() {
        return parkPaddockCapacity;
    }

    public void setParkPaddockCapacity(int parkPaddockCapacity) {
        this.parkPaddockCapacity = parkPaddockCapacity;
    }

    public int paddocksCount() {
        return this.paddocks.size();
    }

    public void addPaddock(Paddock paddock) {
        if (parkPaddockCapacity > paddocksCount()){
            this.paddocks.add(paddock);

        }
    }

    public Paddock findPaddockById(int id){
        return this.paddocks.get(id);
    }

    public void moveDinosaur(Dinosaur selectedDinosaur, Paddock paddock){

//        Dinosaur dino1 = paddock.findDinosaurById(dinoID);
//        Paddock newPaddock = park.findPaddockById(paddockId);
//
//        paddock.removeDinosaurFromPaddock(dino1);
//        newPaddock.addDinosaurToPaddock(dino1);

        selectedDinosaur.setPaddock(paddock);



    }






}
