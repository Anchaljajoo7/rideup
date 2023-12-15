package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rideup.R;
import com.example.rideup.TabRideupAdapter2;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.tabs.TabLayout;

public class MyBookingDetail extends AppCompatActivity implements OnMapReadyCallback {
ViewPager viewPager;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking_detail);
 initial();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.f_map);
        mapFragment.getMapAsync(this);
    }

    private void initial() {
        viewPager=findViewById(R.id.vp);
        tabLayout=findViewById(R.id.tl);

        tabLayout.addTab(tabLayout.newTab().setText("Pickup Points"));
        tabLayout.addTab(tabLayout.newTab().setText("Drop Points"));

        TabRideupAdapter2 tabRideupAdapter2=new TabRideupAdapter2(MyBookingDetail.this,getSupportFragmentManager());
        viewPager.setAdapter(tabRideupAdapter2);

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng myPos = new LatLng(22, 76);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(myPos));

        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.auto);

//        googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        googleMap.addMarker(new MarkerOptions().position(myPos).title("indore").icon(icon));

    }


}