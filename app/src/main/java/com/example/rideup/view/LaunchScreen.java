package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.rideup.R;

public class LaunchScreen extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);


initial();
    }

    private void initial() {
        imageView=findViewById(R.id.ivrideuplogo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(LaunchScreen.this,OnBoarding1.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }
}