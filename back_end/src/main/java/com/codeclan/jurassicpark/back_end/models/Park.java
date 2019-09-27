package com.codeclan.jurassicpark.back_end.models;


import javax.persistence.*;

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



    public Park(String name, int capacity, Boolean lockdown, int paddockCapacity) {
        this.name = name;
        this.capacity = capacity;
        this.lockdown = lockdown;
        this.paddockCapacity = paddockCapacity;
    }

    public Park() {
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

    public Boolean getLockdown() {
        return lockdown;
    }

    public void setLockdown(Boolean lockdown) {
        this.lockdown = lockdown;
    }

    public int getPaddockCapacity() {
        return paddockCapacity;
    }

    public void setPaddockCapacity(int paddockCapacity) {
        this.paddockCapacity = paddockCapacity;
    }
}
