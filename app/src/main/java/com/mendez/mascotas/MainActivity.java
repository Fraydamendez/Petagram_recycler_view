package com.mendez.mascotas;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascota;
    private RecyclerView listaMascotas;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar miActionBar =  findViewById(R.id.miActionBar);
        androidx.appcompat.widget.Toolbar toolbar = miActionBar;
        setSupportActionBar(toolbar);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascota);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        iniciarlizarAdaptador();

    }



    public void iniciarlizarAdaptador() {

        Mascota_Adaptador adaptador;
        adaptador = new Mascota_Adaptador(mascota, this);
        listaMascotas.setAdapter(adaptador);

    }


    public void inicializarListaMascotas() {
        mascota = new ArrayList<Mascota>();

        mascota.add(new Mascota(R.drawable.pug, "Patas", "2"));
        mascota.add(new Mascota(R.drawable.rayas, "Rayas", "4"));
        mascota.add(new Mascota(R.drawable.victor, "Victor", "3"));
        mascota.add(new Mascota(R.drawable.shein, "Shein", "5"));
        mascota.add(new Mascota(R.drawable.coco, "Coquito", "5"));
    }


    public void IrSegundaA(View v){
        Intent intent = new Intent(this, mascota_favorita.class);
        startActivity(intent);
}


}