package com.codeclan.jurassicpark.back_end.models;

import com.codeclan.jurassicpark.back_end.enums.Species;

import javax.persistence.*;

@Entity
@Table(name = "dinosaurs")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    @Enumerated(value = EnumType.STRING)
    private Species species;

    public Dinosaur(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public Dinosaur() {
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

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
