package com.example.rideup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class BookingList extends AppCompatActivity {
    ImageView imageView;
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
        BookingListItem item1 = new BookingListItem("TOYOTO GLANZA", "Description1");
        BookingListItem item2 = new BookingListItem("TOYOTO GLANZA", "Description");
        listItems.add(item1);
        listItems.add(item2);
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