package com.example.muiscaco.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.muiscaco.Modulos;
import com.example.muiscaco.R;
import com.example.muiscaco.adapters.AdapterModulo;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private ArrayList<Modulos> dataSetProducts;
    private RecyclerView recyclerView;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View vista = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView)vista.findViewById(R.id.rvModulos);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        dataSetProducts = new ArrayList<Modulos>();
        llenarDataSet();



        AdapterModulo adapterModulo = new AdapterModulo(dataSetProducts, inflater.getContext());



        recyclerView.setAdapter(adapterModulo);


        return vista ;



    }

    private void llenarDataSet(){



        dataSetProducts.add(new Modulos("Mitos","Mitologias de la cultura.", R.drawable.mitologia));
        dataSetProducts.add(new Modulos("Deidades","Diferentes dioses de la cultura.", R.drawable.mitos));
        dataSetProducts.add(new Modulos("Ubicación","Sitios turisticos y Lagunas.", R.drawable.ubicacion));
        dataSetProducts.add(new Modulos("Lagunas","Lagunas sagradas de la cultura.", R.drawable.lagunas));
        dataSetProducts.add(new Modulos("Costumbres","Diferentes costumbres.", R.drawable.costumbres));
        dataSetProducts.add(new Modulos("Quiz","Juego de preguntas.", R.drawable.juegos));
    }

}
