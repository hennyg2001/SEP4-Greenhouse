package com.example.sep4_greenhouseapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sep4_greenhouseapp.model.Plant;

import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.ViewHolder> {

    private ArrayList<Plant> plants;

    PlantAdapter(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
    }

    public int getItemCount() {
        return plants.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private OnClickListener listener;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            itemView.setOnClickListener(v -> {
                listener.onClick(plants.get(getBindingAdapterPosition()));
            });
        }

        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.plant, parent, false);
            return new ViewHolder(view);
        }

        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
            viewHolder.name.setText(plants.get(position).getName());
        }

        public void setOnClickListener(OnClickListener listener) {
            this.listener = listener;
        }

    }

    public interface OnClickListener {
        void onClick(Plant plant);
    }

}
