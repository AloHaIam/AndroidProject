package com.example.projetap.metier;

public class Lieu {
    private String nom;
    private String adresse;
    private String codepostal;
    private String ville;
    private String numTel;

    public Lieu(String nom, String adresse, String codepostal, String ville, String numTel) {
        this.nom = nom;
        this.adresse = adresse;
        this.codepostal = codepostal;
        this.ville = ville;
        this.numTel = numTel;
    }
}
