package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listmakanan;
    private ArrayList<Makanan> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listmakanan = findViewById(R.id.tampillistmakanan);
        initData();

        listmakanan.setAdapter(new mAdapter(list));
        listmakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.list = new ArrayList<>();
        list.add(new Makanan("Pecel Lele",
                "15.000",
                "Ikan lele  yang digoreng, disajikan dengan nasi, sayur-sayuran dan sambal.",
                R.drawable.pecel_lele));

        list.add(new Makanan("Nasi Goreng Mercon",
                "14.500",
                "Nasi yang digoreng dengan kecap dan bumbu lainnya, dengan tingkat kepedasan yang tinggi.",
                R.drawable.nasi_goreng));

        list.add(new Makanan("Ayam Geprek Keju",
                "20.000",
                "Ayam goreng yang digeprek yang ditambahi keju diatasnya.",
                R.drawable.ayam_geprek));

        list.add(new Makanan("Kari Ayam",
                "17.500",
                "Ayam yang dimasak dengan kari dengan rasa yang nikmat.",
                R.drawable.kari_ayam));

        list.add(new Makanan("Tahu Bulat",
                "500",
                "Tahu yang dibentuk bulat.",
                R.drawable.tahu_bulat));

        list.add(new Makanan("Salad Buah",
                "12.000",
                "Campuran potongan brbagai buah, dengan toping keju dan mayonaise.",
                R.drawable.salad_buah));
    }
}