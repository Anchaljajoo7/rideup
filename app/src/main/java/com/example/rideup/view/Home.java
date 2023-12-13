package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.rideup.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity implements OnMapReadyCallback {
Button button;

DrawerLayout drawerLayout;
    ImageView i1,iv2;
    View vg;
NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initial();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void initial() {
        button=findViewById(R.id.b_search);
        i1 = findViewById(R.id.iv_navigation);
        drawerLayout=findViewById(R.id.drawer);
        iv2=findViewById(R.id.iv_notification);
        vg=findViewById(R.id.navigation_rideup);
        navigationView=findViewById(R.id.navigation);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, BookingList.class);
            startActivity(intent);
            finish();

//                showbottomsheet();

            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView.bringToFront();
        View v=findViewById(R.id.iv_arrownext);
        v.setOnClickListener(v1 -> {
            Intent intent=new Intent(Home.this, Account1.class);
            startActivity(intent);
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Notification.class);
startActivity(intent);
            finish();}
        });



//        linearLayout=findViewById(R.id.ll_date);
//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Home.this, BookingList.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }

//    private void second() {
////       navigation_rideup=findViewById(R.id.iv_arrownext);
//       navigation_rideup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent=new Intent(Home.this, Account1.class);
////                startActivity(intent);
////                finish();
//                Toast.makeText(Home.this, "1234567890", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//    }

//    private void showbottomsheet() {
//        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this);
//        bottomSheetDialog.setContentView(R.layout.bottomsheet_selectlocation);
//        bottomSheetDialog.show();
//    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng myPos = new LatLng(22, 76);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(myPos));

        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.auto);

//        googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        googleMap.addMarker(new MarkerOptions().position(myPos).title("indore").icon(icon));

    }


}


