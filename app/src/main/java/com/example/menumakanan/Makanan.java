package com.example.menumakanan;

public class Makanan {
    private String nama, harga, desk;
    private int gambar;

    public Makanan(String nama, String harga, String desk, int gambar) {
        this.nama = nama;
        this.harga = harga;
        this.desk = desk;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return desk;
    }

    public void setDeskripsi(String desk) {
        this.desk = desk;
    }

    public int getId_gambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
