package com.ameliaR.mycookingassitant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.ameliaR.mycookingassitant.Adapter.KategoriAdapter;
import com.ameliaR.mycookingassitant.Adapter.ResepAdapter;
import com.ameliaR.mycookingassitant.Model.DataKategori;
import com.ameliaR.mycookingassitant.Model.DataResep;
import com.ameliaR.mycookingassitant.Model.Kategori;
import com.ameliaR.mycookingassitant.Model.Resep;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements KategoriAdapter.onKategoriListener , ResepAdapter.onResepListener{
    private RecyclerView rvKategori;
    private RecyclerView rvResep;
    private ArrayList<Kategori> listKategori = new ArrayList<>();
    private ArrayList<Resep> listResep = new ArrayList<>();
    public static final String NAMA_KEY = "NASI";
    public static final String BAHAN_KEY = "SAOS";
    public static final String FOTO_KEY = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvKategori = findViewById(R.id.rv_kategori);
        rvResep = findViewById(R.id.rv_resep);
        listKategori.addAll(DataKategori.getKategori());

        rvKategori.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        KategoriAdapter listKategoriAdapter = new KategoriAdapter(listKategori, this);
        rvKategori.setAdapter(listKategoriAdapter);
    }

    @Override
    public void kategoriListener(int index, Kategori item) {
        //TODO bedakan view perkategori
        if (item.getNama().equals("Makanan")){
            viewMakanan();
        }
        else if(item.getNama().equals("Minuman")){
            viewMinuman();
        }
        else if (item.getNama().equals("Snack")){
            viewSnack();
        }
    }

    public void viewMakanan(){
        listResep.addAll(DataResep.getMakanan());
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ResepAdapter listResepAdapter = new ResepAdapter(listResep);
        rvResep.setAdapter(listResepAdapter);
    }

    public void viewMinuman(){
        listResep.addAll(DataResep.getMinuman());
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ResepAdapter listResepAdapter = new ResepAdapter(listResep);
        rvResep.setAdapter(listResepAdapter);
    }

    public void viewSnack(){
        listResep.addAll(DataResep.getSnack());
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ResepAdapter listResepAdapter = new ResepAdapter(listResep);
        rvResep.setAdapter(listResepAdapter);
    }

    @Override
    public void resepListener(int index, Resep item) {
        Intent intent = new Intent(this , DetailActivity.class);
        intent.putExtra(NAMA_KEY, item.getNama());
        intent.putExtra(FOTO_KEY, item.getFoto());
        intent.putExtra(BAHAN_KEY,item.getBahan());
        startActivity(intent);
    }
}
