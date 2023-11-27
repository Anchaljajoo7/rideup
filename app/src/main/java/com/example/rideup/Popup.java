package com.example.rideup;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class Popup {

   public void showpopupwindow(final View view){

       LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
       View popupView = inflater.inflate(R.layout.popup_window, null);
       int width = LinearLayout.LayoutParams.WRAP_CONTENT;
       int height = LinearLayout.LayoutParams.WRAP_CONTENT;

       boolean focusable = true;

       final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
       popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
   }
}
