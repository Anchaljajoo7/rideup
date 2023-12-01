package com.example.rideup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class CarBookingSeater extends AppCompatActivity {
    TabLayout t1;
    ViewPager v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_booking_seater);
        initial();
    }

    private void initial() {
        t1 = findViewById(R.id.tl_location);
        v1 = findViewById(R.id.vp_seats);

        t1.addTab(t1.newTab().setText("Select Seat"));
        t1.addTab(t1.newTab().setText("Pickup Points"));
        t1.addTab(t1.newTab().setText(" Drop Points"));
        TabRideupAdapter1 myAdapter1 = new TabRideupAdapter1(CarBookingSeater.this, getSupportFragmentManager());
        v1.setAdapter(myAdapter1);
        v1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(t1));
        t1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }}

