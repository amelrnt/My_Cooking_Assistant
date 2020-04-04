package com.ameliaR.mycookingassitant.Model;

import com.ameliaR.mycookingassitant.R;

import java.util.ArrayList;

public class DataKategori {

    public static int fotoKategori[]= {
            R.drawable.kategori_1,
            R.drawable.kategori_2,
            R.drawable.kategori_3
    };

    public static String namaKategori[]= {
            "Makanan",
            "Minuman,",
            "Snack"
    };

    public static ArrayList<Kategori> getKategori(){
        ArrayList<Kategori> list= new ArrayList<>();
        for (int position =0; position < namaKategori.length;position++) {
            Kategori kategori = new Kategori();
            kategori.setNama(namaKategori[position]);
            kategori.setFoto(fotoKategori[position]);
            list.add(kategori);
        }
        return list;
    }

}
