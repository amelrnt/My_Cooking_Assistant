package com.ameliaR.mycookingassitant.Model;

public class Resep {
    String nama;
    String bahan;
    String cara;
    String deskripsi;
    int foto;

    public Resep() {
    }

    public String getNama() {
        return nama;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
