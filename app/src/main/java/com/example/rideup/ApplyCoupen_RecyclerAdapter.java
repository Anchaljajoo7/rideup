package com.example.rideup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ApplyCoupen_RecyclerAdapter extends RecyclerView.Adapter<ApplyCoupen_RecyclerAdapter.MyViewHolder> {

    ArrayList<ApplyCoupenListItem>applyCoupenListItems;
    Context context;

    public ApplyCoupen_RecyclerAdapter(ArrayList<ApplyCoupenListItem> applyCoupenListItems, Context context) {
        this.applyCoupenListItems = applyCoupenListItems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleradapter_subclass_applycoupen,parent,false);
       MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ApplyCoupenListItem applyCoupenListItem=applyCoupenListItems.get(position);
      holder.t1.setText(""+applyCoupenListItem.getCoupentype());
      holder.t2.setText(""+applyCoupenListItem.getSaveruppe());
      holder.t3.setText(""+applyCoupenListItem.getContent());

    }



    @Override
    public int getItemCount() {
        return applyCoupenListItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.tv_axis200);
            t2=itemView.findViewById(R.id.tv_save_rupee);
            t3=itemView.findViewById(R.id.tv_content);



        }
    }
}
