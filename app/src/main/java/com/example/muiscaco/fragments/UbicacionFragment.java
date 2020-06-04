package com.example.muiscaco.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.muiscaco.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class UbicacionFragment extends Fragment implements OnMapReadyCallback {

GoogleMap map;
MapView mMapView;
View mView;
    public UbicacionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mView = inflater.inflate(R.layout.fragment_blank_fragment3, container, false);

        return mView;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMapView= (MapView) mView.findViewById(R.id.map);
        if (mMapView!=null){
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        map=googleMap;
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        LatLng MuseoArqueologico = new LatLng(5.709884, -72.924386);
        map.addMarker(new MarkerOptions().position(MuseoArqueologico).title("Museo arqueologico muisca"));
        map.moveCamera(CameraUpdateFactory.newLatLng(MuseoArqueologico));
    }
}
