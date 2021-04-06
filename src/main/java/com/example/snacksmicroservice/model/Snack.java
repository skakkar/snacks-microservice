package com.example.snacksmicroservice.model;

import javax.persistence.*;

@Entity
@Table(name="snack")
public class Snack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Snack(String name) {
        this.name = name;
    }

    public Snack() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
