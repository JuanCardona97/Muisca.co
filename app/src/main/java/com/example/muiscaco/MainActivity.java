package com.example.muiscaco;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TIPO_PRODUCT="tipoProducto";

    private int idTypeProduct;
    private TextView text;
    private ArrayList<Modulos> dataSetProducts;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);


        recyclerView = (RecyclerView)findViewById(R.id.rvModulos);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        dataSetProducts = new ArrayList<Modulos>();
        llenarDataSet();

        recyclerView.setAdapter(new AdapterModulo(dataSetProducts));


    }

    private void llenarDataSet(){
        dataSetProducts.add(new Modulos("Mitos","Las diferentes mitologias de la cultura Muisca", R.drawable.mitos));
        dataSetProducts.add(new Modulos("Ubicación","Las diferentes partes donde se ubicaban", R.drawable.ubicacion));
        dataSetProducts.add(new Modulos("Lagunas","Las diferentes lagunas sagradas", R.drawable.lagunas));
        dataSetProducts.add(new Modulos("Costumbres","Las diferentes costumbres que tenian como comunidad", R.drawable.costumbres));
    }
}
