package com.ameliaR.mycookingassitant.Model;

public class RecipeModel {
    private String namaMakanan;
    private String deskripsi;
    private String resep;
    private String jenis;

    public RecipeModel() {
    }

    public RecipeModel(String namaMakanan, String deskripsi, String resep, String jenis) {
        this.namaMakanan = namaMakanan;
        this.deskripsi = deskripsi;
        this.resep = resep;
        this.jenis = jenis;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
