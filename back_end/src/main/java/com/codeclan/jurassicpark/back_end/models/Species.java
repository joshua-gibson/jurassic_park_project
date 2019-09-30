package com.codeclan.jurassicpark.back_end.models;

import com.codeclan.jurassicpark.back_end.enums.DietType;

import javax.persistence.*;

@Entity
@Table(name="species")
public class Species {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="type")
    private String type;

    @Column(name="length")
    private double length;

    @Column(name="info")
    private String info;

    @Column(name="url")
    private String url;

    @Column(name="diet_type")
    private DietType dietType;

    public Species(String type, DietType dietType, double length, String info, String url) {

        this.type = type;
        this.dietType = dietType;
        this.length = length;
        this.info = info;
        this.url = url;
    }

    public Species()
    {

    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public String getInfo() {
        return info;
    }

    public String getUrl() {
        return url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
