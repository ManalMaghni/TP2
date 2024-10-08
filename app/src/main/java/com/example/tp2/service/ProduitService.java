package com.example.tp2.service;

import com.example.tp2.classes.Produit;
import com.example.tp2.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    public ProduitService(){
        produit=new ArrayList<>();
    }
    private List<Produit> produit;
    @Override
    public boolean create(Produit o) {
        return produit.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produit.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for (Produit p: produit )
            if(p.getId()==id)
                return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produit;
    }
}
