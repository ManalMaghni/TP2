package com.example.tp2.classes;

import com.example.tp2.R;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detailIngred;
    private String description;
    private String preparation;
    private static int comp = 0;

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detailIngred, String description, String preparation) {
        this.id = ++comp;
        this.description = description;
        this.detailIngred = detailIngred;
        this.duree = duree;
        this.nom = nom;
        this.photo = photo;
        this.preparation = preparation;
        this.nbrIngredients = nbrIngredients;
    }


    public Produit() {
        this.id = ++comp;
        this.description = "description";
        this.detailIngred = "detailIngred";
        this.duree = "10 min";
        this.nom = "pizza";
        this.photo = R.drawable.pizza1;
        this.preparation = "preparation";
        this.nbrIngredients = 3;
    }

    public int getId() {
        return id;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetailIngred() {
        return detailIngred;
    }

    public String getNom() {
        return nom;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public static int getComp() {
        return comp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static void setComp(int comp) {
        Produit.comp = comp;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDetailIngred(String detailIngred) {
        this.detailIngred = detailIngred;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailIngred='" + detailIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}