package com.ameliaR.mycookingassitant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ameliaR.mycookingassitant.Model.Resep;
import com.ameliaR.mycookingassitant.R;

import java.util.ArrayList;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ViewHolder> {
    private ArrayList<Resep> listResep;

    public ResepAdapter(ArrayList<Resep> listResep) {
        this.listResep = listResep;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resep_item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Resep resep = listResep.get(position);
        holder.tvNama.setText(resep.getNama());
        holder.tvDetail.setText(resep.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fotoResep;
        TextView tvNama;
        TextView tvDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoResep = itemView.findViewById(R.id.photo_resep);
            tvNama = itemView.findViewById(R.id.tv_resep_name);
            tvDetail = itemView.findViewById(R.id.tv_resep_detail);
        }
    }
}