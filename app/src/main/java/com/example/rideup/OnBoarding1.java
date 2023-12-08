package com.example.rideup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class OnBoarding1 extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {
View view;
int dotsCount;
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

    private void setReference() {


        viewPager=findViewById(R.id.pager_introduction);
        appCompatButton1=findViewById(R.id.b_skip);
        appCompatButton2=findViewById(R.id.b_next);

        linearLayout = findViewById(R.id.viewPagerCountDots);

       appCompatButton1.setOnClickListener(this);
       appCompatButton2.setOnClickListener(this);
        OnBoarding_Model item1 =new OnBoarding_Model("Welcome to trident taxi ride share service","By comparing all the major ride options in one free app");
OnBoarding_Model item2=new OnBoarding_Model("Get rides to great ride without the hassle","By comparing all the major ride options in one free app");
OnBoarding_Model item3=new OnBoarding_Model("Save time, save money and safe ride","By comparing all the major ride options in one free app");
        onBoardingModels.add(item1);
        onBoardingModels.add(item2);
        onBoardingModels.add(item3);

        OnBoarding_Adapter onBoardingAdapter = new OnBoarding_Adapter(onBoardingModels,OnBoarding1.this);

        viewPager.setAdapter(onBoardingAdapter);
        viewPager.setCurrentItem(0);

        viewPager.setOnPageChangeListener(this);
        setUiPageViewController();
    }

    private void setUiPageViewController() {
//        dotsCount = onBoardingModels.get(dotsCount);
//        dots = new ImageView[dotsCount];


    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
//        for (int i = 0; i < dotsCount; i++) {
//            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditemdot));
//        }
//
//        dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditemdot));
//
//        if (position + 1 == dotsCount) {
//            btnNext.setVisibility(View.GONE);
//            btnFinish.setVisibility(View.VISIBLE);
//        } else {
//            btnNext.setVisibility(View.VISIBLE);
//            btnFinish.setVisibility(View.GONE);
//        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


}