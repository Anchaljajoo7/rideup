package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rideup.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class PaymentOptions extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_options);
        initial();
    }

    private void initial() {
        button=findViewById(R.id.b_proceedtopay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showbottomseet();
            }
        });

    }
TextView textView;

    private void showbottomseet() {

        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this);

        bottomSheetDialog.setContentView(R.layout.bottomsheet_addnewcard_rideup);
        bottomSheetDialog.show();
        textView=bottomSheetDialog.findViewById(R.id.b_savecard);
       textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentOptions.this,PaymentSuccesful.class);
               startActivity(intent);
                finish();
            }
        });


    }
}