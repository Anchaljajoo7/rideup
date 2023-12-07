package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.rideup.R;

public class Account extends AppCompatActivity {
AppCompatButton appCompatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        initial();
    }

    private void initial() {
        appCompatButton=findViewById(R.id.b_save);
        appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account.this, MyBooking.class);
                startActivity(intent);
                finish();
            }
        });
    }
}