package com.bubenheimer.mapsv3markertapoutofcontrol;

import android.os.Bundle;

import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.OnMapReadyCallback;
import com.google.android.libraries.maps.SupportMapFragment;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.MarkerOptions;

import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().getFragments().get(0);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                googleMap.addMarker(
                        new MarkerOptions().position(new LatLng(0.0, 0.0)).draggable(true));
            }
        });
    }
}
