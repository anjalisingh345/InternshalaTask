package com.example.android.internshalatask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.internshalatask.R;

import org.jetbrains.annotations.NotNull;

public class MiddleAdapter extends RecyclerView.Adapter<MiddleAdapter.ViewHolder>
{

    Integer[] img = {R.drawable.edogawa,R.drawable.usa,R.drawable.india,R.drawable.edogawa,R.drawable.usa,R.drawable.india,R.drawable.edogawa,R.drawable.usa,R.drawable.india};
    String[] cityname = {"Edogawa","Usa","Indian","Edogawa","Usa","Indian","Edogawa","Usa","Indian"};

    @NonNull
    @NotNull
    @Override
    public MiddleAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.middle_view, parent, false);
        return new MiddleAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MiddleAdapter.ViewHolder holder, int position) {
        holder.relativeLayout.setBackgroundResource(img[position]);
        holder.city_name.setText(cityname[position]);
    }

    @Override
    public int getItemCount() {
        return cityname.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        TextView city_name;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            relativeLayout =itemView.findViewById(R.id.relative_layout);
            city_name =itemView.findViewById(R.id.city_name);
        }
    }
}