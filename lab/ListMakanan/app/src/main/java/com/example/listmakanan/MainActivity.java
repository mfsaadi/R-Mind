package com.example.listmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }
    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Soto Pak Man",
                "Jl. Pamularsih Raya, Semarang",
                "Sotonya enak banget",
                R.drawable.soto));
        listKuliner.add(new Kuliner("Bakso",
                "Jl. Pamularsih Raya, Semarang",
                "Bakso paling enak di Semarang",
                R.drawable.bakso));
        listKuliner.add(new Kuliner("Sate",
                "Jl. Imam Bonjol, Semarang",
                "Sate terenak",
                R.drawable.sate));
        listKuliner.add(new Kuliner("Nasi Goreng",
                "Jl. Kelud Sampangan, Semarang",
                "Nasi gorengnya enak, tapi lumayan mahal",
                R.drawable.nasi));
    }
}