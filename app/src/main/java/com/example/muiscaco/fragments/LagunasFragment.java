package com.example.muiscaco.fragments;


import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.muiscaco.DAO.LagunaDao;
import com.example.muiscaco.R;
import com.example.muiscaco.models.Laguna;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LagunasFragment extends Fragment {

    private TextView title,description;
    private ImageView image;
    private Button next, before;

    private LagunaDao lagunaDao;

    private ArrayList<Laguna> lagunas;

    int fila=0;

    public LagunasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        lagunaDao = new LagunaDao(inflater.getContext());
        lagunas = new ArrayList<Laguna>();
        lagunas=lagunaDao.consultarLagunas();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lagunas, container, false);
    }

    private void cambiarLaguna(){
        title.setText(lagunas.get(fila).getTitle());
        description.setText(lagunas.get(fila).getDescritpion());
        image.setImageResource(lagunas.get(fila).getImage());
    }

    @Override
    public void onStart() {
        super.onStart();
        View v = getView();

        title = (TextView)v.findViewById(R.id.tvTitleL);
        description = (TextView)v.findViewById(R.id.tvDescriptionL);
        image = (ImageView)v.findViewById(R.id.ivImageL);
        before = (Button)v.findViewById(R.id.btnAnteriorL);
        next = (Button)v.findViewById(R.id.btnSiguienteL);
        description.setMovementMethod(new ScrollingMovementMethod());

        //Mostrar la primera fila
        cambiarLaguna();



       before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(fila==0){
                    before.setEnabled(false);
                    cambiarLaguna();
                }else{
                    next.setEnabled(true);
                    fila--;
                    cambiarLaguna();
                }

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fila+1==lagunas.size()){
                    next.setEnabled(false);
                    cambiarLaguna();
                }
                else{
                    before.setEnabled(true);
                    fila++;
                    cambiarLaguna();
                }

            }
        });





    }

}
