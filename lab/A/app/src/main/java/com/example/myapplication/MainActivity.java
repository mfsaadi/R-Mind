package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String namaBidang;
    int panjang, lebar;
    double luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaBidang = "Lingkaran";

        if(namaBidang.equalsIgnoreCase("Lingkaran")){
            lingkaran(10);
        } else {
            persegi(12,15);
        }

        ArrayList<String> bidang = new ArrayList<>();
        bidang.add("Lingkaran");
        bidang.add("persegi");
        bidang.add("Lingkaran");
        bidang.add("Lingkaran");
        bidang.add("Persegi");

        for(int i=0;i<bidang.size();i++){
            Log.d("bidang","==== Bidang ke "+(i+1)+" =====");
            namaBidang = bidang.get(i);
            if(bidang.get(i).equalsIgnoreCase("Lingkaran")){
                lingkaran(i+3);
            } else {
                persegi(i+5,i+10);
            }

        }

    //    static_array();
    //    dynamic_array();

    }

    public void static_array(){
        String dataNim[] = new String[10];
        double dataIpk[] = new double[10];

        dataNim[0] = "A11.2021.12345";
        dataNim[1] = "A11.2021.12346";
        dataNim[2] = "A11.2021.12347";

        dataIpk[0] = 3.5;
        dataIpk[1] = 3.7;
        dataIpk[2] = 3.1;

        for(int i=0;i<3;i++){
            Log.d("array",dataNim[i]+" : "+dataIpk[i]);
        }
    }

    public void dynamic_array(){
        ArrayList<String> dataNim = new ArrayList<>();
        ArrayList<Double> dataIpk = new ArrayList<>();

        dataNim.add("A11.2021.12345");
        dataNim.add("A11.2021.12346");
        dataNim.add("A11.2021.12347");

        dataIpk.add(3.4);
        dataIpk.add(3.8);
        dataIpk.add(3.3);

        for(int i=0; i<dataNim.size();i++){
            Log.d("larik",dataNim.get(i)+" : "+dataIpk.get(i));
        }
    }

    public void perulangan(){
        namaBidang = "Lingkaran";
        for(int i=0;i<5;i++){
            lingkaran(i+2);
        }

        namaBidang = "Persegi";
        int it = 0;
        while (it<5){
            persegi(it+2,it+3);
            it++;
        }
    }

    public void lingkaran(int diameter){
        panjang=diameter;

        luas = Math.PI * Math.pow((panjang/2), 2);
        keliling = 2 * Math.PI * (panjang/2);

        Log.d("bidang","Nama Bidang : "+namaBidang);
        Log.d("bidang","Diameter : "+panjang);
        Log.d("bidang","Luasnya : "+luas);
        Log.d("bidang","Kelilingnya : "+keliling);
    }

    public void persegi(int panjang, int lebar){
        // namaBidang = "Persegi Panjang";
        this.panjang = panjang;
        this.lebar = lebar;

        luas = panjang*lebar;
        keliling = 2*(panjang + lebar);

        Log.d("bidang","Nama Bidang : "+namaBidang);
        Log.d("bidang","Panjang : "+panjang+" dan Lebar : "+lebar);
        Log.d("bidang","Luasnya : "+luas);
        Log.d("bidang","Kelilingnya : "+keliling);

    }

    public void awal(String nama){
        Log.d("hello","Selamat Datang" +nama+", semoga sukses");

        System.out.println("Selamat datang di pemprograman Java");
        System.out.println("SELAMAT DATANG");
        Log.d("output","Ini pesan yang mau ditampilkan");
        Log.e("error","Ini pesan error");
    }

}
