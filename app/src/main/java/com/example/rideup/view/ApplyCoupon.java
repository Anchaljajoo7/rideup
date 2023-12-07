package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rideup.ApplyCoupenListItem;
import com.example.rideup.ApplyCoupen_RecyclerAdapter;
import com.example.rideup.R;

import java.util.ArrayList;

public class ApplyCoupon extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_coupon);
        recyclerView=findViewById(R.id.rvrecyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<ApplyCoupenListItem>arrayList=new ArrayList<>();
        ApplyCoupenListItem item1=new ApplyCoupenListItem("AXIS200","Save ₹122 on this" +
                " orders using Axis Bank\n" +
                "Select Credit Cards! ","It is a long established fact that a reader will be\n" +
                " distracted by the readable content of a page \n" +
                "when looking at its layout. The point o");

        ApplyCoupenListItem item2=new ApplyCoupenListItem("AXIS200","Save ₹122 on this" +
                " orders using Axis Bank\n" +
                "Select Credit Cards! ","It is a long established fact that a reader will be\n" +
                " distracted by the readable content of a page \n" +
                "when looking at its layout. The point o");

        ApplyCoupenListItem item3=new ApplyCoupenListItem("AXIS200","Save ₹122 on this" +
                " orders using Axis Bank\n" +
                "Select Credit Cards! ","It is a long established fact that a reader will be\n" +
                " distracted by the readable content of a page \n" +
                "when looking at its layout. The point o");

        ApplyCoupenListItem item4=new ApplyCoupenListItem("AXIS200","Save ₹122 on this" +
                " orders using Axis Bank\n" +
                "Select Credit Cards! ","It is a long established fact that a reader will be\n" +
                " distracted by the readable content of a page \n" +
                "when looking at its layout. The point o");

        arrayList.add(item1);
        arrayList.add(item2);
        arrayList.add(item3);
        arrayList.add(item4);

        ApplyCoupen_RecyclerAdapter applyCoupen_recyclerAdapter=new ApplyCoupen_RecyclerAdapter(arrayList,ApplyCoupon.this);
        recyclerView.setAdapter(applyCoupen_recyclerAdapter);


    }
}