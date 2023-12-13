package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rideup.R;

public class PaymentSuccesful extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_succesful);
        initial();
    }

    private void initial() {
        button=findViewById(R.id.b_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentSuccesful.this, MyBooking.class);
                startActivity(intent);
                finish();
            }
        });
    }
}