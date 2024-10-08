package com.example.tp2.adapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp2.R;
import com.example.tp2.classes.Produit;

import java.util.List;

public class Adapter extends BaseAdapter {
    private List<Produit> produit;
    private LayoutInflater inflater;
    public Adapter(List<Produit> produit,Activity activity){
        this.produit=produit;
        inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produit.size();
    }

    @Override
    public Object getItem(int i) {
        return produit.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.items,null);
        ImageView photo=convertView.findViewById(R.id.image1);
        TextView nom=convertView.findViewById(R.id.text1);
        TextView id=convertView.findViewById(R.id.text2);
        TextView duree=convertView.findViewById(R.id.text3);
        photo.setImageResource(produit.get(position).getPhoto());
        duree.setText(produit.get(position).getDuree());
        nom.setText(produit.get(position).getNom());
        id.setText(String.valueOf(produit.get(position).getId()));
        return convertView;
    }
}
