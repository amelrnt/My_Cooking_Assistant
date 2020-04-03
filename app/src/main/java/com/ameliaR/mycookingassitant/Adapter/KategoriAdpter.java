package com.ameliaR.mycookingassitant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ameliaR.mycookingassitant.Model.Kategori;

import com.ameliaR.mycookingassitant.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class KategoriAdpter extends RecyclerView.Adapter<KategoriAdpter.ViewHolder> {
    private ArrayList<Kategori> listKategori;

    public KategoriAdpter(ArrayList<Kategori> listKategori) {
        this.listKategori = listKategori;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.kategori_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Kategori kategori = listKategori.get(position);

        Glide.with(holder.itemView.getContext())
                .load(kategori.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imageKategori);
        holder.textKategori.setText(kategori.getNama());
    }

    @Override
    public int getItemCount() {
        return listKategori.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageKategori;
        private TextView textKategori;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageKategori = itemView.findViewById(R.id.photo_kategori);
            textKategori = itemView.findViewById(R.id.tv_kategori);
        }



    }
}
