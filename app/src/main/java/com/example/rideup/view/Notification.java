package com.example.rideup.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rideup.NotificationListItem;
import com.example.rideup.Notification_RecyclerAdapter;
import com.example.rideup.R;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {
RecyclerView recyclerView;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        initial();
        recyclerView=findViewById(R.id.rvrecyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
                ArrayList<NotificationListItem>notificationListItems=new ArrayList<>();
        NotificationListItem item1=new NotificationListItem("Payment Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae","Today");
        NotificationListItem item4=new NotificationListItem("Credit Card added!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae"," ");
        NotificationListItem item5=new NotificationListItem("Added Money wallet Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae"," ");
        NotificationListItem item6=new NotificationListItem("5% Special Discount!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae"," ");
        NotificationListItem item7=new NotificationListItem("Payment Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae","May, 27 2023");
        NotificationListItem item3=new NotificationListItem("Payment Successfully!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae","Yesterday");
        NotificationListItem item2=new NotificationListItem("30% Special Discount!","Lorem ipsum dolor sit amet consectetur. Ultrici es tincidunt eleifend vitae"," ");
notificationListItems.add(item1);
notificationListItems.add(item2);
notificationListItems.add(item3);
notificationListItems.add(item4);
notificationListItems.add(item5);
notificationListItems.add(item6);
notificationListItems.add(item7);

        Notification_RecyclerAdapter notificationRecyclerAdapter=new Notification_RecyclerAdapter(notificationListItems,Notification.this);
        recyclerView.setAdapter(notificationRecyclerAdapter);

    }

    private void initial() {
        imageView=findViewById(R.id.ivarrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Notification.this, Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}