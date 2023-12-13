package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rideup.R;

public class Account1 extends AppCompatActivity {
ImageView imageView,imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account1);
        initial();

    }

    private void initial() {
        imageView=findViewById(R.id.ivarrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account1.this, Home.class);
                startActivity(intent);
                finish();
            }
        });
        imageView1=findViewById(R.id.iv_editprofile);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account1.this, Account.class);
                startActivity(intent);
                finish();
            }
        });
    }
}