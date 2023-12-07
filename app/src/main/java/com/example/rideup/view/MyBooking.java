package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rideup.MyBookinglist_RecyclerAdapter;
import com.example.rideup.Mybookinglistitem;
import com.example.rideup.R;

import java.util.ArrayList;

public class MyBooking extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);
        recyclerView=findViewById(R.id.rvrecyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<Mybookinglistitem>arrayList=new ArrayList<>();
        Mybookinglistitem item1=new Mybookinglistitem("Toyota Glanza","Booking ID #123445678980",
                "Booking Date 10/19/2023","Vijay Nagar, Indore, Madhya Pradesh 452011",
                "Car Number \nMp09po09","Paid by Credit Card \n₹ 1580.00","Track Driver");
        Mybookinglistitem item2=new Mybookinglistitem("Toyota Glanza","Booking ID #123445678980",
                "Booking Date 10/19/2023","Vijay Nagar, Indore, Madhya Pradesh 452011",
                "Car Number \nMp09po09","Paid by Credit Card \n₹ 1580.00","Complete");


        arrayList.add(item1);
        arrayList.add(item2);
        MyBookinglist_RecyclerAdapter myBookinglist_recyclerAdapter=new MyBookinglist_RecyclerAdapter(arrayList,MyBooking.this);
        recyclerView.setAdapter(myBookinglist_recyclerAdapter);
    }
}