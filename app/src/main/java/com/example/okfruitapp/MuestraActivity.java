package com.example.okfruitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class MuestraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muestra);

        Button btnAbrirCamara = findViewById(R.id.AbrirCamara);
        Button btnAbrirGaleria = findViewById(R.id.AbrirGaleria);


        btnAbrirCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre la cámara
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        btnAbrirGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre la galería
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(intent);
            }
        });

        ImageButton btnRegresar = findViewById(R.id.Regresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cierra esta actividad y regresa a la actividad anterior
                finish();
            }
        });

        Button botonIrSubirImagen = findViewById(R.id.IrSubirImagen);

        botonIrSubirImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un Intent para abrir la actividad "InicioSesionActivity"
                Intent intent = new Intent(MuestraActivity.this, SubirImagenActivity.class);
                startActivity(intent);
            }
        });






    }
}
