package com.example.muiscaco.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.muiscaco.Modulos;
import com.example.muiscaco.R;
import com.example.muiscaco.fragments.HomeFragment;
import com.example.muiscaco.fragments.MitosFragment;
import com.example.muiscaco.fragments.UbicacionFragment;

import java.util.ArrayList;

public class AdapterModulo extends RecyclerView.Adapter<AdapterModulo.ViewHolderCVModulo>  {

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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity)v.getContext();
                Fragment fragment = null;

                switch (position){
                    case 0:
                        fragment = new MitosFragment();
                        break;
                    case 1:
                        fragment = new UbicacionFragment();
                        break;
                    case 2:
                        fragment = new UbicacionFragment();
                        break;
                    case 3:
                        fragment = new UbicacionFragment();
                        break;

                    default:
                        fragment = new HomeFragment();
                        break;
                }

                if(fragment!=null){
                    FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.flFrameLayout,fragment);
                    ft.addToBackStack(null);
                    //Falta mas investigar que mas se le pone
                    ft.commit();
                }

                /*if(position==1){
                    AppCompatActivity activity = (AppCompatActivity)v.getContext();
                    UbicacionFragment blankFragment3 = new UbicacionFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.flFrameLayout,blankFragment3).addToBackStack(null).commit();

                }*/

            }
        });

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
