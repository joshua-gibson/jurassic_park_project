package com.codeclan.jurassicpark.back_end.models;

import com.codeclan.jurassicpark.back_end.enums.ECarnivore;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Carnivore extends Dinosaur {

    @Column(name = "species")
    @Enumerated(value = EnumType.STRING)
    private ECarnivore eCarnivore;

    public Carnivore(String name, Paddock paddock, ECarnivore eCarnivore){
        super(name, paddock);
        this.eCarnivore = eCarnivore;
    }

    public ECarnivore getCarnivore() {
        return eCarnivore;
    }

    public void setCarnivore(ECarnivore carnivore) {
        this.eCarnivore = eCarnivore;
    }
}
