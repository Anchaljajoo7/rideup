package com.example.rideup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    }



    @Override
    public int getItemCount() {
        return notificationListItems.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
TextView t1,tv2;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            t1=itemView.findViewById(R.id.tv_type);
            tv2=itemView.findViewById(R.id.tv_content);
        }
    }
}
