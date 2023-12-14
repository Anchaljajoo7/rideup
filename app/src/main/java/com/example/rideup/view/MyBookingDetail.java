package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rideup.R;
import com.example.rideup.TabRideupAdapter2;
import com.google.android.material.tabs.TabLayout;

public class MyBookingDetail extends AppCompatActivity {
ViewPager viewPager;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking_detail);
 initial();
    }

    private void initial() {
        viewPager=findViewById(R.id.vp);
        tabLayout=findViewById(R.id.tl);

        tabLayout.addTab(tabLayout.newTab().setText("Pickup Points"));
        tabLayout.addTab(tabLayout.newTab().setText("Drop Points"));

        TabRideupAdapter2 tabRideupAdapter2=new TabRideupAdapter2(MyBookingDetail.this,getSupportFragmentManager());
        viewPager.setAdapter(tabRideupAdapter2);

    }
}