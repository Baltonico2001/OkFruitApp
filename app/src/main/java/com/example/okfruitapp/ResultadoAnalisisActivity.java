package com.example.okfruitapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class ResultadoAnalisisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_analisis);

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
