package com.example.rideup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabRideUpAdapter extends FragmentPagerAdapter {
    public TabRideUpAdapter(Detail detail,@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                BoardingPointTabLayout boardingPointTabLayout=new BoardingPointTabLayout();
                return  boardingPointTabLayout;
            case 1:
                RatingTabLayout ratingTabLayout=new RatingTabLayout();
                return ratingTabLayout;

        }
        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
