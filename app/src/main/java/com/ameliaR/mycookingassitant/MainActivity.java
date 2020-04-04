package com.ameliaR.mycookingassitant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ameliaR.mycookingassitant.Adapter.KategoriAdapter;
import com.ameliaR.mycookingassitant.Adapter.ResepAdapter;
import com.ameliaR.mycookingassitant.Model.DataKategori;
import com.ameliaR.mycookingassitant.Model.DataResep;
import com.ameliaR.mycookingassitant.Model.Kategori;
import com.ameliaR.mycookingassitant.Model.Resep;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements KategoriAdapter.onKategoriListener{
    private RecyclerView rvKategori;
    private RecyclerView rvResep;
    private ArrayList<Kategori> listKategori = new ArrayList<>();
    private ArrayList<Resep> listResep = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvKategori = findViewById(R.id.rv_kategori);
        rvResep = findViewById(R.id.rv_resep);
        listKategori.addAll(DataKategori.getKategori());

        rvKategori.setLayoutManager(new LinearLayoutManager(this));
        KategoriAdapter listKategoriAdapter = new KategoriAdapter(listKategori, this);
        rvKategori.setAdapter(listKategoriAdapter);
    }

    @Override
    public void kategoriListener(int index, Kategori item) {
        //TODO bedakan view perkategori
        listResep.addAll(DataResep.getMakanan());
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ResepAdapter listResepAdapter = new ResepAdapter(listResep);
        rvResep.setAdapter(listResepAdapter);
    }
}
