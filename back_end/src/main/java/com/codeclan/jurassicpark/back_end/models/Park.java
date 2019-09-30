package com.codeclan.jurassicpark.back_end.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="park")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "lockdown")
    private Boolean lockdown;

    @Column(name="paddock_capacity")
    private int paddockCapacity;

    @JsonIgnore
    @OneToMany(mappedBy = "park", fetch = FetchType.LAZY)
    private List<Paddock> paddocks;

    public Park(String name, int capacity, int paddockCapacity) {
        this.name = name;
        this.capacity = capacity;
        this.paddockCapacity = paddockCapacity;
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


    public int getPaddockCapacity() {
        return paddockCapacity;
    }

    public void setPaddockCapacity(int paddockCapacity) {
        this.paddockCapacity = paddockCapacity;
    }

    public int getPaddocksCount() {
        return this.paddocks.size();
    }

    public void addPaddock(Paddock paddock) {
        this.paddocks.add(paddock);
    }
}
