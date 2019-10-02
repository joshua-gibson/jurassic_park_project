package com.codeclan.jurassicpark.back_end.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "dinosaurs")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("dinosaur")
    @ManyToOne
    @JoinColumn(name="paddock_id", nullable= false)
    private Paddock paddock;

    @JsonIgnoreProperties("dinosaur")
    @ManyToOne
    @JoinColumn(name="species_id", nullable= false)
    private Species species;


    public Dinosaur(String name, Paddock paddock, Species species) {
        this.name = name;
        this.paddock = paddock;
        this.species = species;
    }

    public Dinosaur() {
    }

    public Species getSpecies() { return species; }

    public void setSpecies(Species species) { this.species = species; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
