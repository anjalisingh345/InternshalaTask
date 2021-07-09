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

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.ViewHolder>
{

    Integer[] img = {R.drawable.edogawa,R.drawable.usa,R.drawable.india};
    String[] eventname = {"Fireworks in Edogawa","Usa city","Indian city"};
    String[] other_details ={"july 1-13 / Tokyo / Free","july 2-5 / Usa / Free","july 25-30 / india / Free"};

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public TopAdapter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull TopAdapter.ViewHolder holder, int position) {
        holder.relativeLayout.setBackgroundResource(img[position]);
        holder.event_name.setText(eventname[position]);
        holder.other_details.setText(other_details[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        TextView event_name,other_details;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            relativeLayout =itemView.findViewById(R.id.relative_layout);
            event_name =itemView.findViewById(R.id.event_name);
            other_details =itemView.findViewById(R.id.other_Details);
        }
    }
}