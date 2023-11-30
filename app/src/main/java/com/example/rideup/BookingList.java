package com.example.rideup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class BookingList extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    LinearLayout linearLayout;
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);
        initial();
        recyclerView=findViewById(R.id.rvrecyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<BookingListItem> listItems = new ArrayList<>();
        BookingListItem item1 = new BookingListItem("Toyota Glanza", "5 Seater | Black","258 Ratings","Vijay Nagar, Indore,Madhya Pradesh 452011",
                "Cameron Williamson |","Male","Driver","21 years old","4 seats available","₹ 1580.00");
        BookingListItem item2 = new BookingListItem("Toyota Glanza", "5 Seater | Black","258 Ratings","Vijay Nagar, Indore,Madhya Pradesh 452011",
                "Cameron Williamson |","Male","Driver","21 years old","4 seats available","₹ 1580.00");
        BookingListItem item3 = new BookingListItem("Toyota Glanza", "5 Seater | Black","258 Ratings ","Vijay Nagar, Indore,Madhya Pradesh 452011",
                "Cameron Williamson |","Male","Driver","21 years old","4 seats available","₹ 1580.00");
        BookingListItem item4 = new BookingListItem("Toyota Glanza", "5 Seater | Black","258 Ratings","Vijay Nagar, Indore,Madhya Pradesh 452011",
                "Cameron Williamson |","Male","Driver","21 years old","4 seats available","₹ 180.00");

        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);
        listItems.add(item4);


        RideupRecyclerAdapter rideupRecyclerAdapter = new RideupRecyclerAdapter(listItems, BookingList.this);
        recyclerView.setAdapter(rideupRecyclerAdapter);
    }

    private void initial() {
        imageView=findViewById(R.id.iv_edit1);
imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        showbottomsheetforsearchvehicle();
    }
});
linearLayout=findViewById(R.id.ll_filter);
linearLayout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        showbottomsheetforfilters();
    }
});

//textView=findViewById(R.id.tv_book);
//textView.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Intent intent=new Intent(BookingList.this, Detail.class);
//        startActivity(intent);
//        finish();
//    }
//});
    }

    private void showbottomsheetforfilters() {
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottomsheet_filter_rideup);
        bottomSheetDialog.show();

    }

    private void showbottomsheetforsearchvehicle() {
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottomsheet_vehiclesearch_rideup);
        bottomSheetDialog.show();

    }
}