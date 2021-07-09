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

public class BottomAdapter extends RecyclerView.Adapter<BottomAdapter.ViewHolder>{
    Integer[] img = {R.drawable.music,R.drawable.movies,R.drawable.club,R.drawable.party};
    String[] eventName = {"Music","Movies","Club","Party"};
    @NonNull
    @NotNull
    @Override
    public BottomAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottom_view, parent, false);
        return new BottomAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull BottomAdapter.ViewHolder holder, int position) {
        holder.relativeLayout.setBackgroundResource(img[position]);
        holder.city_name.setText(eventName[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
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
