package com.mendez.mascotas;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.widget.Toast.makeText;



public class Mascota_Adaptador extends RecyclerView.Adapter<Mascota_Adaptador.MascotaViewHolde> {

    ArrayList<Mascota> mascota;
    Activity activity;

    public Mascota_Adaptador(ArrayList<Mascota> mascota, mascota_favorita mainActivity) {
        this.activity = activity;
        this.mascota=mascota;


    }

    public Mascota_Adaptador(ArrayList<Mascota> mascota, MainActivity mainActivity) {
        this.activity = activity;
        this.mascota=mascota;

    }

    @NonNull
    @Override
    public MascotaViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotaViewHolde(v);


    }


    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolde mascotaViewHolde, int position) {
       final Mascota mascotas= mascota.get(position);
        mascotaViewHolde.imgFoto.setImageResource(mascotas.getImagen());
        mascotaViewHolde.tv_nombreCV.setText(mascotas.getNombre());
        mascotaViewHolde.tvPuntuacionCV.setText(mascotas.getPuntuacion());

        mascotaViewHolde.btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Agregaste a " + mascotas.getNombre()+  " como favorito" , Toast.LENGTH_SHORT).show();
            }
        });



    }


    @Override
    public int getItemCount() {
        return mascota.size();
    }



        public static class MascotaViewHolde extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView tv_nombreCV;
        private TextView tvPuntuacionCV;
        private ImageView btnFav;




        public MascotaViewHolde(View itemView) {
            super(itemView);
            imgFoto         = (ImageView) itemView.findViewById(R.id.imgFoto);
            tv_nombreCV     = (TextView) itemView.findViewById(R.id.tvnombre);
            tvPuntuacionCV  = (TextView) itemView.findViewById(R.id.tvpuntuacion);
            btnFav          = (ImageView) itemView.findViewById(R.id.imgHuesoBlanco);


        }
    }

}
