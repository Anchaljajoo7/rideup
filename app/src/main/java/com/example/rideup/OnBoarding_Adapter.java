package com.example.rideup;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;


public class OnBoarding_Adapter extends PagerAdapter {
    ArrayList<OnBoarding_Model>onBoardingModels;
    Context context;
ImageView imageView;
    TextView textView1,textView2;



    public OnBoarding_Adapter(ArrayList<OnBoarding_Model> onBoardingModels, Context context) {
        this.onBoardingModels = onBoardingModels;
        this.context = context;

    }

    @Override
    public int getCount() {
        return onBoardingModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return  view== object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.pager_item_circleindicator, container, false);
        Log.d("message", "instantiateItem: "+getItemPosition(itemView));
imageView=itemView.findViewById(R.id.iv_rideup);
        if (position == 0) {
            imageView.setImageResource(R.drawable.rideup1);
        } else if (position == 1) {
            imageView.setImageResource(R.drawable.rideup2);
        } else if (position == 2) {
            imageView.setImageResource(R.drawable.rideup3);
        }
textView1=itemView.findViewById(R.id.tv_welcome_trident);
textView2=itemView.findViewById(R.id.tv_by_comparing);
textView1.setText(onBoardingModels.get(position).getContent());
textView2.setText(onBoardingModels.get(position).getContent1());
container.addView(itemView);
return itemView;
    }


    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
