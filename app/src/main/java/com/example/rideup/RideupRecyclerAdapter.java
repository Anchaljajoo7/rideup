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

    public RideupRecyclerAdapter(ArrayList<BookingListItem> bookingListItems, Context context) {
        this.bookingListItems = bookingListItems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rideup_adapter_subclass,parent,false);
        MyViewHolder myViewHolder= new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        BookingListItem bookingListItem= bookingListItems.get(position);
        holder.t1.setText(""+bookingListItem.getName());
        holder.t2.setText(""+bookingListItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return bookingListItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            t1=itemView.findViewById(R.id.tv_toyoto_glanza);
            t2=itemView.findViewById(R.id.tv_5_star);
        }
    }

}
