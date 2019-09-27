package com.codeclan.jurassicpark.back_end.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="paddocks")
public class Paddock {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="visitor_capacity")
    private int visitorCapacity;

    @Column(name="dinosaur_capacity")
    private int dinosaurCapacity;

    @JsonIgnore
    @OneToMany(mappedBy = "paddock", fetch = FetchType.LAZY)
    private List<Dinosaur> dinosaurs;

    public Paddock(String name, int visitorCapacity, int dinosaurCapacity) {
        this.name = name;
        this.visitorCapacity = visitorCapacity;
        this.dinosaurCapacity = dinosaurCapacity;
        this.dinosaurs = new ArrayList<>();

    }

    public Paddock() {
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

    public int getVisitorCapacity() {
        return visitorCapacity;
    }

    public void setVisitorCapacity(int visitorCapacity) {
        this.visitorCapacity = visitorCapacity;
    }

    public int getDinosaurCapacity() {
        return dinosaurCapacity;
    }

    public void setDinosaurCapacity(int dinosaurCapacity) {
        this.dinosaurCapacity = dinosaurCapacity;
    }

    public List<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(List<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }
}
