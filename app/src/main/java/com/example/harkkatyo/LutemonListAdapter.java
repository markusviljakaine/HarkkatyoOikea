package com.example.harkkatyo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class LutemonListAdapter extends RecyclerView.Adapter<LutemonViewHolder>{

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    public LutemonListAdapter(Context context, ArrayList<Lutemon> lutemons){
        this.context = context;
        this.lutemons = new ArrayList<>(lutemons);
    }

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position){
        Lutemon lutemon = lutemons.get(position);
        holder.lutemonName.setText(lutemon.getName() + " (" + lutemon.getColor() + ")");

    }

    @Override
    public int getItemCount(){
        return lutemons.size();
    }
}
