package com.ameliaR.mycookingassitant.Model;

import com.ameliaR.mycookingassitant.R;

import java.util.ArrayList;

public class DataResep {

    public static String namaMakanan[]= {
         "Nasi Goreng",
          "Tenderloin Steak",
          "Aglio Olio",
          "Soto Ayam"
    };

    public static int fotoMakanan[]={
            R.drawable.nasgor,
            R.drawable.tenderloin,
            R.drawable.sotoayam,
            R.drawable.aglio
    };

    public static String namaMinuman[]= {
        "Dalgona Coffe",
        "Green Tea Latte",
        "Bajigur"
    };

    public static int fotoMinuman[]={
         R.drawable.dalgona,
         R.drawable.greentea,
         R.drawable.bajigur
    };

    public static String namaSnack[] = {
        "Pisang Nugget",
         "Oreo Dessert Box",
         "Singkong Goreng Keju"
    };

    public static int fotoSnack[]={
         R.drawable.pisangnugget,
         R.drawable.oreobox,
         R.drawable.pisangnugget
    };

//    public static String kategori[]= {
//        "Makanan",
//        "Minuman",
//        "Snack"
//    };

    public static String bahanMakanan[]={
        "Nasi\n Bumbu",
        "Daging\n wortel\n saus",
        "Spagetti\n udang\nsusu",
        "Ayam\n Bumbu"
    };

    public static String bahanMinuman[] = {
         "Air\n kopi\n gula\n susu",
          "Air\n susu\n greentea",
         "Jahe\n degan"
    };

    public static String bahanSnack[] = {
         "Pisang\n Tepung\n Roti",
         "Oreo\n Susu\n Pudding",
         "Singkong\n Minyak\n Bawang"
    };

    public static String deskripsiMakanan[]= {
        "Nasi dengan bumbu dan digoreng dengan minyak",
        "Daging tender dimasak di hotplate",
        "Ngunu iku lah",
        "Ayam dengan kuah dan bumbu kuning"
    };

    public static String deskripsiMinumann[] ={
        "Susu dingin dengan kopi kental",
        "Minuman greean tea dengan latte",
        "Minuman hangat terbuat dari jahe dengan tambahan degan"
    };

    public static String deskripsiSnack[]={
        "Pisang yang digoreng bersama tepung roti",
         "Pudding dengan tambahan remahan oreo dan roti",
         "Singkong goreng renyah dengan taburan keju"
    };



    public static ArrayList<Resep> getMakanan(){
      ArrayList<Resep> list= new ArrayList<>();
        for (int position =0; position < namaMakanan.length;position++){
            Resep rsp = new Resep();
            rsp.setNama(namaMakanan[position]);
            rsp.setFoto(fotoMakanan[position]);
            rsp.setBahan(bahanMakanan[position]);
            rsp.setDeskripsi(deskripsiMakanan[position]);
            list.add(rsp);
        }
        return list;
    }

    public static ArrayList<Resep> getMinuman(){
        ArrayList<Resep> list= new ArrayList<>();
        for (int position =0; position < namaMinuman.length;position++){
            Resep rsp = new Resep();
            rsp.setNama(namaMinuman[position]);
            rsp.setFoto(fotoMinuman[position]);
            rsp.setBahan(bahanMinuman[position]);
            rsp.setDeskripsi(deskripsiMinumann[position]);
            list.add(rsp);
        }
        return list;
    }

    public static ArrayList<Resep> getSnack(){
        ArrayList<Resep> list= new ArrayList<>();
        for (int position =0; position < namaSnack.length;position++){
            Resep rsp = new Resep();
            rsp.setNama(namaSnack[position]);
            rsp.setFoto(fotoSnack[position]);
            rsp.setBahan(bahanSnack[position]);
            rsp.setDeskripsi(deskripsiSnack[position]);
            list.add(rsp);
        }
        return list;
    }
}
