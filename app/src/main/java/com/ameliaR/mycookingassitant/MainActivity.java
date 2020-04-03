package com.ameliaR.mycookingassitant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ameliaR.mycookingassitant.Adapter.KategoriAdpter;
import com.ameliaR.mycookingassitant.Model.DataKategori;
import com.ameliaR.mycookingassitant.Model.Kategori;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKategori;
    //private RecyclerView rvResep;
    private ArrayList<Kategori> listKategori = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvKategori = findViewById(R.id.rv_kategori);
        listKategori.addAll(DataKategori.getKategori());

        rvKategori.setLayoutManager(new LinearLayoutManager(this));
        KategoriAdpter listKategoriAdapter = new KategoriAdpter(listKategori);
        rvKategori.setAdapter(listKategoriAdapter);

    }

    public void viewItemAfter(){
        //TODO
        //set data muncul setelah kategori di klik
    }
}
