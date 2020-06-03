package com.example.muiscaco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class AdapterModulo extends RecyclerView.Adapter<AdapterModulo.ViewHolderCVModulo> {

    private ArrayList<Modulos> dataSet;

    public AdapterModulo(ArrayList<Modulos> datos){
        dataSet=datos;

    }

    @NonNull
    @Override
    public ViewHolderCVModulo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_modulos,parent,false);


        return new ViewHolderCVModulo(v);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCVModulo holder, final int position) {
        final Modulos modulo = dataSet.get(position);
        holder.ivProduct.setImageResource(modulo.idResource);
        holder.titleProduct.setText(modulo.getTitle());
        holder.descriptionProduct.setText(modulo.getDescription());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class ViewHolderCVModulo extends RecyclerView.ViewHolder{
        private ImageView ivProduct;
        private TextView titleProduct;
        private TextView descriptionProduct;

        public ViewHolderCVModulo(View view){
            super(view);
            ivProduct = (ImageView)view.findViewById((R.id.ivCvProduct));
            titleProduct = (TextView)view.findViewById((R.id.tvTitleProduct));
            descriptionProduct = (TextView)view.findViewById((R.id.tvDescriptionProduct));
        }
    }
}
