package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mAdapter extends RecyclerView.Adapter<mAdapter.ViewHolder> {

    private ArrayList<Makanan> listmakanan;

    public mAdapter(ArrayList<com.example.menumakanan.Makanan> listmakanan) {
        this.listmakanan = listmakanan;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.makanan, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        com.example.menumakanan.Makanan makanan = listmakanan.get(position);
        holder.tampilNama.setText(makanan.getNama());
        holder.tampilHarga.setText(makanan.getHarga());
        holder.tampilgambar.setImageResource(makanan.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Detaill.class);
                intent.putExtra("nama", makanan.getNama());
                intent.putExtra("harga", makanan.getHarga());
                intent.putExtra("deskripsi", makanan.getDeskripsi());
                intent.putExtra("gambar", makanan.getId_gambar());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listmakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tampilNama, tampilHarga;
        public ImageView tampilgambar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tampilNama = (TextView) itemView.findViewById(R.id.tampilnama);
            tampilHarga = (TextView) itemView.findViewById(R.id.tampilharga);
            tampilgambar = (ImageView) itemView.findViewById(R.id.tampilgambar);
        }
    }
}
