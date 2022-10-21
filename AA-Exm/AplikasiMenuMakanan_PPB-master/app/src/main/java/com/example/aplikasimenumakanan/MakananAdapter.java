package com.example.aplikasimenumakanan;

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

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {

    private ArrayList<com.example.aplikasimenumakanan.Makanan> listmakanan;

    public MakananAdapter(ArrayList<com.example.aplikasimenumakanan.Makanan> listmakanan) {
        this.listmakanan = listmakanan;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        com.example.aplikasimenumakanan.Makanan makanan = listmakanan.get(position);
        holder.textNama.setText(makanan.getNama());
        holder.textHarga.setText(makanan.getHarga());
//        holder.textDeskripsi.setText(makanan.getDeskripsi());
        holder.imageView.setImageResource(makanan.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), makanan.getNama(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
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
        public TextView textNama, textHarga, textDeskripsi;
        public ImageView imageView;
//        public LinearLayout itemView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textNama = (TextView) itemView.findViewById(R.id.textNama);
            textHarga = (TextView) itemView.findViewById(R.id.textHarga);
//            textDeskripsi = (TextView) itemView.findViewById(R.id.textDeskripsi);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
//            this.itemView = (LinearLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}