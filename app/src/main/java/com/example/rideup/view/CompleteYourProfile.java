package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rideup.R;

public class CompleteYourProfile extends AppCompatActivity {
ImageView imageView,imageView1;

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_your_profile);
        initial();
    }

    private void initial() {
        imageView=findViewById(R.id.ivarrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CompleteYourProfile.this, OTPCode.class);
                startActivity(intent);
                finish();
            }
        });
        button=findViewById(R.id.b_continue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(CompleteYourProfile.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.popup_window);
                dialog.show();


            }

        });


    }



}