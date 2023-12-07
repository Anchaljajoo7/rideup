package com.example.rideup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyBookinglist_RecyclerAdapter extends RecyclerView.Adapter<MyBookinglist_RecyclerAdapter.MyViewHolder> {
    ArrayList<Mybookinglistitem>mybookinglistitems;
    Context context;


    public MyBookinglist_RecyclerAdapter(ArrayList<Mybookinglistitem> mybookinglistitems, Context context) {
        this.mybookinglistitems = mybookinglistitems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleradapter_subclass_mybooking,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
Mybookinglistitem mybookinglistitem=mybookinglistitems.get(position);
holder.t1.setText(""+mybookinglistitem.getCarname());
holder.t2.setText(""+mybookinglistitem.getBookingid());
holder.t3.setText(""+mybookinglistitem.getBookingdate());
holder.t4.setText(""+mybookinglistitem.getCaraddress());
holder.t5.setText(""+mybookinglistitem.getCarnumber());
holder.t6.setText(""+mybookinglistitem.getPaidby());
holder.t7.setText(""+mybookinglistitem.getButton1());
    }


    @Override
    public int getItemCount() {
        return mybookinglistitems.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1, t2, t3, t4, t5, t6, t7;
        public MyViewHolder(@NonNull View itemView) {


            super(itemView);
            t1=itemView.findViewById(R.id.tv_toyoto_glanza);
            t2=itemView.findViewById(R.id.tv_bookingid);
            t3=itemView.findViewById(R.id.tv_bookingdate);
            t4=itemView.findViewById(R.id.tv_address);
            t5=itemView.findViewById(R.id.tv_carnumber);
            t6=itemView.findViewById(R.id.tv_paideby);
            t7=itemView.findViewById(R.id.tv_trackdriver);

        }
    }
}
