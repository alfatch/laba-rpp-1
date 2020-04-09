package com.amin.lw_01_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewHolder>
{
    private int _count;
    public RecyclerViewAdapter(int count)
    {
        _count = count;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();

        int layout              = R.layout.item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view               = inflater.inflate(layout, parent,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position)
    {
        holder.bind(position);
    }

    @Override
    public int getItemCount()
    {
        return _count;
    }
}
