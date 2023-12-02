package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rideup.R;
import com.example.rideup.TabRideUpAdapter;
import com.google.android.material.tabs.TabLayout;

public class Detail extends AppCompatActivity {
    TabLayout t1;
    ViewPager v1;
ImageView imageView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initial();
        imageView=findViewById(R.id.iv_car);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Detail.this,BookingList.class);
                startActivity(intent);
                finish();
            }
        });
        button=findViewById(R.id.b_booknow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Detail.this, CarBookingSeater.class);
                startActivity(intent);
                finish();

            }
        });
    }

    private void initial() {
        t1 = findViewById(R.id.tblayout);
        v1 = findViewById(R.id.vpviewpager);

        t1.addTab(t1.newTab().setText("Boarding & Drop Points"));
        t1.addTab(t1.newTab().setText("Rating"));
        TabRideUpAdapter myAdapter = new TabRideUpAdapter(Detail.this, getSupportFragmentManager());
        v1.setAdapter(myAdapter);
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