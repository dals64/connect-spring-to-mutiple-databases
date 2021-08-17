package com.itns.test.models;

import org.springframework.data.annotation.Id;

public class Second {
    @Id
    private String id;

    private String nom;

    public Second(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
