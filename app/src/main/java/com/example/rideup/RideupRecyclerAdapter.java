package com.example.rideup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RideupRecyclerAdapter extends RecyclerView.Adapter<RideupRecyclerAdapter.MyViewHolder> {
    ArrayList<BookingListItem> bookingListItems;
    Context context;
    selectVechile selectvechile;

    public RideupRecyclerAdapter(ArrayList<BookingListItem> bookingListItems, Context context, selectVechile selectvechile) {
        this.bookingListItems = bookingListItems;
        this.context = context;
        this.selectvechile = selectvechile;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rideup_adapter_subclass, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        BookingListItem bookingListItem = bookingListItems.get(position);
        holder.t1.setText("" + bookingListItem.getCarname());
        holder.t2.setText("" + bookingListItem.getCarseater());
        holder.t3.setText("" + bookingListItem.getCarrating());
        holder.t4.setText("" + bookingListItem.getCaraddress());
        holder.ev1.setImageResource(R.drawable.car);
        holder.ev2.setImageResource(R.drawable.location);
        holder.ev3.setImageResource(R.drawable.success);

        holder.ev5.setImageResource(R.drawable.driverimage);
        holder.ev6.setImageResource(R.drawable.male);
        holder.ev7.setImageResource(R.drawable.driver);
        holder.ev8.setImageResource(R.drawable.seatsavailable);
        holder.t5.setText("" + bookingListItem.getDrivername());
        holder.t6.setText("" + bookingListItem.getGender());
        holder.t7.setText("" + bookingListItem.getDriver());
        holder.t8.setText("" + bookingListItem.getAge());
        holder.t9.setText("" + bookingListItem.getSeatsavilable());
        holder.t10.setText("" + bookingListItem.getPrice());
holder.t11.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        selectvechile.recyclertoactivity(position); ;
    }
});

        if (position == 0) {
            holder.ev1.setImageResource(R.drawable.car);
        } else if (position == 1) {
            holder.ev1.setImageResource(R.drawable.bus);
        } else if (position == 2) {
            holder.ev1.setImageResource(R.drawable.auto);
        } else if (position == 3) {
            holder.ev1.setImageResource(R.drawable.bike);
        }


    }

    @Override
    public int getItemCount() {
        return bookingListItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10,t11;
        ImageView ev1, ev2, ev3, ev5, ev6, ev7, ev8;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            t1 = itemView.findViewById(R.id.tv_toyoto_glanza);
            t2 = itemView.findViewById(R.id.tv_5_star);
            t3 = itemView.findViewById(R.id.tv_ratings);
            t4 = itemView.findViewById(R.id.tv_address);
            t5 = itemView.findViewById(R.id.tv_drivername);
            t6 = itemView.findViewById(R.id.tv_male);
            t7 = itemView.findViewById(R.id.tv_driver);
            t8 = itemView.findViewById(R.id.tv_age);
            t9 = itemView.findViewById(R.id.tv_seats_available);
            t10 = itemView.findViewById(R.id.tv_price);
            t11=itemView.findViewById(R.id.tv_book);


            ev1 = itemView.findViewById(R.id.iv_car);
            ev2 = itemView.findViewById(R.id.ivlocation);
            ev3 = itemView.findViewById(R.id.iv_success);

            ev5 = itemView.findViewById(R.id.iv_driverimage);
            ev6 = itemView.findViewById(R.id.iv_male);
            ev7 = itemView.findViewById(R.id.iv_driver);
            ev8 = itemView.findViewById(R.id.iv_seats_available);
        }
    }
public interface selectVechile{
     void recyclertoactivity(int position);


}
}
