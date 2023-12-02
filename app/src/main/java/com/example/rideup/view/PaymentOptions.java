package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

    private void showbottomseet() {
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottomsheet_addnewcard_rideup);
        bottomSheetDialog.show();


    }
}