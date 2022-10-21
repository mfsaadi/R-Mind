package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    String nama="";
    String harga="";
    String deskripsi="";
    int gambar=0;
    TextView namaMakanan, detailDeskripsi, detailHarga;
    ImageView detailGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            nama = bundle.getString("nama");
            harga = bundle.getString("harga");
            deskripsi = bundle.getString("deskripsi");
            gambar = bundle.getInt("gambar");
        }

        namaMakanan = findViewById(R.id.namaMakanan);
        namaMakanan.setText("Nama : "+nama);

        detailHarga = findViewById(R.id.detailHarga);
        detailHarga.setText("Harga : Rp. "+harga);

        detailDeskripsi = findViewById(R.id.detailDeskripsi);
        detailDeskripsi.setText("Deskripsi : \n"+deskripsi);

        detailGambar = findViewById(R.id.detailGambar);
        detailGambar.setImageResource(gambar);
    }
}