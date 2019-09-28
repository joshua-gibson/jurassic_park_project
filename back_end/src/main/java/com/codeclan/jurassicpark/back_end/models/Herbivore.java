package com.codeclan.jurassicpark.back_end.models;

import com.codeclan.jurassicpark.back_end.enums.EHerbivore;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Herbivore extends Dinosaur{

    @Column(name = "species")
    @Enumerated(value = EnumType.STRING)
    private EHerbivore eHerbivore;

    public Herbivore (String name, Paddock paddock, EHerbivore eHerbivore) {
        super(name, paddock);
        this.eHerbivore = eHerbivore;
    }

    public EHerbivore getHerbivore() {
        return eHerbivore;
    }

    public void setHerbivore(EHerbivore eHerbivore) {
        this.eHerbivore = eHerbivore;
    }
}
