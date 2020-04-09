package com.ameliaR.mycookingassitant;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.ameliaR.mycookingassitant.Adapter.KategoriAdapter;
import com.ameliaR.mycookingassitant.Adapter.ResepAdapter;
import com.ameliaR.mycookingassitant.Model.DataKategori;
import com.ameliaR.mycookingassitant.Model.DataResep;
import com.ameliaR.mycookingassitant.Model.Kategori;
import com.ameliaR.mycookingassitant.Model.Resep;
import com.skydoves.transformationlayout.TransformationAppCompatActivity;
import com.skydoves.transformationlayout.TransformationCompat;
import com.skydoves.transformationlayout.TransformationLayout;
import com.skydoves.transformationlayout.TransitionExtensionKt;

import java.util.ArrayList;

public class MainActivity extends TransformationAppCompatActivity implements KategoriAdapter.onKategoriListener , ResepAdapter.onResepListener{
    private RecyclerView rvKategori;
    private RecyclerView rvResep;
    private ArrayList<Kategori> listKategori = new ArrayList<>();
    private ArrayList<Resep> listResep = new ArrayList<>();
    public static final String NAMA_KEY = "NASI";
    public static final String BAHAN_KEY = "SAOS";
    public static final String FOTO_KEY = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TransitionExtensionKt.onTransformationStartContainer(this);
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
        switch (item.getNama()) {
            case "Makanan":
                viewMakanan();
                break;
            case "Minuman":
                viewMinuman();
                break;
            case "Snack":
                viewSnack();
                break;
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
        TransformationLayout transformationLayout = findViewById(R.id.transformationLayout);
        Bundle bundle = transformationLayout.withContext(this, "myTransitionName");
        Intent intent = new Intent(this , DetailActivity.class);
        intent.putExtra(NAMA_KEY, item.getNama());
        intent.putExtra(FOTO_KEY, item.getFoto());
        intent.putExtra(BAHAN_KEY,item.getBahan());
        //startActivity(intent,bundle);
        TransformationCompat.INSTANCE.startActivity(transformationLayout, intent);
    }

}
