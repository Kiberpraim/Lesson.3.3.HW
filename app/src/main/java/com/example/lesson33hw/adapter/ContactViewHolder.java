package com.example.lesson33hw.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson33hw.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView textViewName;
    ImageView icon;
    TextView textViewAge;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String name) {
        textViewName = itemView.findViewById(R.id.textViewName);
        icon = itemView.findViewById(R.id.imageViewIcon);
        textViewAge = itemView.findViewById(R.id.textViewAge);

        textViewName.setText(name.substring(0,name.length()-3));
        textViewAge.setText(name.substring(name.length()-3));
    }
}