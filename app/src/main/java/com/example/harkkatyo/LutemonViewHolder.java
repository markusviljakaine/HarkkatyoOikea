package com.example.harkkatyo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder{
    TextView lutemonName, lutemonColor;

    public LutemonViewHolder(@NonNull View itemView){
        super(itemView);
        lutemonName = itemView.findViewById(R.id.LutemonName);
    }

}
