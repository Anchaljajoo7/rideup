package com.example.rideup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.rideup.view.Drop;
import com.example.rideup.view.MyBookingDetail;
import com.example.rideup.view.Pickup;

public class TabRideupAdapter2 extends FragmentPagerAdapter {


    public TabRideupAdapter2(MyBookingDetail myBookingDetail, @NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position)
        {
            case 0:
                Pickup pickup=new Pickup();
        return  pickup;
            case 1:
              Drop drop=new Drop();
                return drop;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
