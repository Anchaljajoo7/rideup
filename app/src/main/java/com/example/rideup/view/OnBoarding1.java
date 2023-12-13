package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rideup.OnBoarding_Adapter;
import com.example.rideup.OnBoarding_Model;
import com.example.rideup.R;

import java.util.ArrayList;

public class OnBoarding1 extends AppCompatActivity implements ViewPager.OnPageChangeListener {
View view;

int dotsCount;
    ImageView[] dots;
    ArrayList<OnBoarding_Model>onBoardingModels=new ArrayList<>();

ViewPager viewPager;
LinearLayout linearLayout;
AppCompatButton appCompatButton1,appCompatButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding1);
        setReference();

    }



    OnBoarding_Adapter onBoardingAdapter = new OnBoarding_Adapter(onBoardingModels,OnBoarding1.this);

    private void setReference() {


        viewPager=findViewById(R.id.pager_introduction);
        appCompatButton1=findViewById(R.id.b_skip);
        appCompatButton2=findViewById(R.id.b_next);
        appCompatButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnBoarding1.this, NumberVerification.class);
                startActivity(intent);
                finish();
            }
        });
        appCompatButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int  pos= viewPager.getCurrentItem();
               if(pos==0){
                   viewPager.setCurrentItem(1);
                } else if (pos==1) {
                   viewPager.setCurrentItem(2);
               } else if (pos==2) {
                   Intent intent=new Intent(OnBoarding1.this,NumberVerification.class);
                   startActivity(intent);
                   finish();

               }
            }
        });

        linearLayout = findViewById(R.id.viewPagerCountDots);


        OnBoarding_Model item1 =new OnBoarding_Model("Welcome to trident taxi ride share service","By comparing all the major ride options in one free app");
OnBoarding_Model item2=new OnBoarding_Model("Get rides to great ride without the hassle","By comparing all the major ride options in one free app");
OnBoarding_Model item3=new OnBoarding_Model("Save time, save money and safe ride","By comparing all the major ride options in one free app");
        onBoardingModels.add(item1);
        onBoardingModels.add(item2);
        onBoardingModels.add(item3);


        viewPager.setAdapter(onBoardingAdapter);
        viewPager.setCurrentItem(0);

        viewPager.setOnPageChangeListener(this);
        setUiPageViewController();
    }

    private void setUiPageViewController() {
        dotsCount =onBoardingAdapter.getCount();
        dots = new ImageView[dotsCount];
        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditemdot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);

           linearLayout.addView(dots[i], params);
        }


    }

//    @Override
//    public void onClick(View v) {
//v.getId(R.id.b_skip) {
//
//        }
//    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {


        for (int i = 0; i < dotsCount; i++) {
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditemdot));
        }

        dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditemdot));


    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


}