package com.example.menumakanan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Detaill extends AppCompatActivity {
    String nama="";
    String harga="";
    String deskripsi="";
    int gambar=0;
    TextView detailNama, detailDeskripsi, detailHarga;
    ImageView detailGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill);

        Button tampilBtn = findViewById(R.id.tampilbtn);
        tampilBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Detaill.this, "Makanan Telah Dipesan", Toast.LENGTH_LONG).show();
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            nama = bundle.getString("nama");
            harga = bundle.getString("harga");
            deskripsi = bundle.getString("deskripsi");
            gambar = bundle.getInt("gambar");
        }

        detailNama = findViewById(R.id.detailNama);
        detailNama.setText("Nama : "+nama);

        detailHarga = findViewById(R.id.detailHarga);
        detailHarga.setText("Harga : Rp. "+harga);

        detailDeskripsi = findViewById(R.id.detailDeskripsi);
        detailDeskripsi.setText("Deskripsi : \n"+deskripsi);

        detailGambar = findViewById(R.id.detailGambar);
        detailGambar.setImageResource(gambar);
    }
}
