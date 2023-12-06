package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rideup.R;

public class AddPassangers extends AppCompatActivity {
Button button;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_passangers);
        initial();


    }

    private void initial() {
        button=findViewById(R.id.b_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddPassangers.this,PaymentOptions.class);
                startActivity(intent);
                finish();
            }
        });
        imageView=findViewById(R.id.iv_arrow_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}