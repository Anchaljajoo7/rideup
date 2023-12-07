package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rideup.NotificationListItem;
import com.example.rideup.Notification_RecyclerAdapter;
import com.example.rideup.R;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView=findViewById(R.id.rvrecyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<NotificationListItem>notificationListItems=new ArrayList<>();
        NotificationListItem item1=new NotificationListItem("Payment Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae");
        NotificationListItem item4=new NotificationListItem("Credit Card added!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae");
        NotificationListItem item5=new NotificationListItem("Added Money wallet Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae");
        NotificationListItem item6=new NotificationListItem("5% Special Discount!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae");
        NotificationListItem item3=new NotificationListItem("Payment Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae");
        NotificationListItem item2=new NotificationListItem("30% Special Discount!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae");
notificationListItems.add(item1);
notificationListItems.add(item2);
notificationListItems.add(item3);

        Notification_RecyclerAdapter notificationRecyclerAdapter=new Notification_RecyclerAdapter(notificationListItems,Notification.this);
        recyclerView.setAdapter(notificationRecyclerAdapter);

    }
}