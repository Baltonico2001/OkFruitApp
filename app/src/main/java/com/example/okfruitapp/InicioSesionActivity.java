package com.example.okfruitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageButton;



public class InicioSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion); // Establece el diseño XML correcto


        Button botonIrMuestra = findViewById(R.id.IrMuestra);

        botonIrMuestra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un Intent para abrir la actividad "InicioSesionActivity"
                Intent intent = new Intent(InicioSesionActivity.this, MuestraActivity.class);
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

    }
}
