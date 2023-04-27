package com.example.harkkatyo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonCheckHolder extends RecyclerView.ViewHolder {
    TextView lutemonName, lutemonColor;

    public LutemonCheckHolder(@NonNull View itemView) {
        super(itemView);
        lutemonName = itemView.findViewById(R.id.checkBox);
    }
}