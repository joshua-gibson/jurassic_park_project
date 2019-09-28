package com.codeclan.jurassicpark.back_end.models;

import com.codeclan.jurassicpark.back_end.enums.EOmnivore;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Omnivore extends Dinosaur {

    @Column(name = "species")
    @Enumerated(value = EnumType.STRING)
    private EOmnivore eOmnivore;

    public Omnivore (String name, Paddock paddock, EOmnivore eOmnivore) {
        super(name, paddock);
        this.eOmnivore = eOmnivore;
    }

    public EOmnivore getOmnivore() {
        return eOmnivore;
    }

    public void setOmnivore(EOmnivore eOmnivore) {
        this.eOmnivore = eOmnivore;
    }
}
