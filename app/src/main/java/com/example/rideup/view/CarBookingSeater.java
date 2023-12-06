package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rideup.R;
import com.example.rideup.TabRideupAdapter1;
import com.google.android.material.tabs.TabLayout;

public class CarBookingSeater extends AppCompatActivity {
    TabLayout t1;
    ViewPager v1;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_booking_seater);
        initial();
        second();
    }

    private void second() {
        imageView=findViewById(R.id.iv_arrow_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CarBookingSeater.this, Detail.class);
                startActivity(intent);
                finish();

            }
        });
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

