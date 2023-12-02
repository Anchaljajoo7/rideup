package com.example.rideup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.rideup.view.CarBookingSeater;

public class TabRideupAdapter1 extends FragmentPagerAdapter {
    public TabRideupAdapter1(CarBookingSeater carBookingSeater, @NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
               SelectSeatTabLayout selectSeatTabLayout=new SelectSeatTabLayout();
                return selectSeatTabLayout;
            case 1:
                PickupPointsTabLayout pickupPointsTabLayout=new PickupPointsTabLayout();
                return pickupPointsTabLayout;
            case 2:
                DropPointsTabLayout dropPointsTabLayout=new DropPointsTabLayout();
                return dropPointsTabLayout;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
