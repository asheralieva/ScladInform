package com.example.scladinform.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.scladinform.models.Order;
import com.example.scladinform.databinding.ItemOrderBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    ItemOrderBinding binding;
    ArrayList<Order> list = new ArrayList<Order>();
    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOrderBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOrderBinding binding;
        public ViewHolder(@NonNull ItemOrderBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }

        public void onBind(Order order) {
        }
    }
}
