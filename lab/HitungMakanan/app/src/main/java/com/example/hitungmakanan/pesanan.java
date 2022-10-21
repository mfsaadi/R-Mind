package com.example.hitungmakanan;

public class pesanan {
    public String makanan;
    public int harga;
    public int jumlah;

    public pesanan(String makanan, int harga, int jumlah) {
        this.makanan = makanan;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return makanan + "(" + jumlah + "x" + harga + ")";
    }

}


