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

public class Notification_RecyclerAdapter extends RecyclerView.Adapter<Notification_RecyclerAdapter.MyHolder> {

    ArrayList<NotificationListItem>notificationListItems;
    Context context;

    public Notification_RecyclerAdapter(ArrayList<NotificationListItem> notificationListItems, Context context) {
        this.notificationListItems = notificationListItems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleradapter_subclass_notification,parent,false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        NotificationListItem notificationListItem=notificationListItems.get(position);
        holder.t1.setText(""+notificationListItem.getType());
        holder.tv2.setText(""+notificationListItem.getContent());
        holder.tv3.setText(""+notificationListItem.getDay());

        if (position == 0) {
            holder.imageView.setImageResource(R.drawable.paymentsuccessful);
        } else if (position == 1) {
            holder.imageView.setImageResource(R.drawable.discountimage);
        } else if (position == 2) {
            holder.imageView.setImageResource(R.drawable.paymentsuccessful);
        } else if (position == 3) {
            holder.imageView.setImageResource(R.drawable.ccadded);
        }
        else if (position == 4) {
            holder.imageView.setImageResource(R.drawable.addedmoney);
        }
        else if (position == 5) {
            holder.imageView.setImageResource(R.drawable.discountimage);
        }


    }



    @Override
    public int getItemCount() {
        return notificationListItems.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
TextView t1,tv2,tv3;
ImageView imageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
imageView=itemView.findViewById(R.id.iv_image);
            t1=itemView.findViewById(R.id.tv_type);
            tv2=itemView.findViewById(R.id.tv_content);
            tv3=itemView.findViewById(R.id.tv_day);
        }
    }
}
