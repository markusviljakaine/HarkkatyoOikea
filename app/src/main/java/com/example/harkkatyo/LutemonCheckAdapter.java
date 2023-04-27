package com.example.harkkatyo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonCheckAdapter extends RecyclerView.Adapter<LutemonCheckHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    public LutemonCheckAdapter(Context context, ArrayList<Lutemon> lutemons){
        this.context = context;
        this.lutemons = new ArrayList<>(lutemons);
    }

    @NonNull
    @Override
    public LutemonCheckHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new LutemonCheckHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_check, parent, false));
    }

    public void onBindViewHolder(@NonNull LutemonCheckHolder holder, int position){
        Lutemon lutemon = lutemons.get(position);
        holder.lutemonName.setText(lutemon.getName() + " (" + lutemon.getColor() + ")");

    }

    @Override
    public int getItemCount(){
        return lutemons.size();
    }
}
