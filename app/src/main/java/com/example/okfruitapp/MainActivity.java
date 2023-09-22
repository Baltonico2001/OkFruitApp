package com.example.okfruitapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonIrAInicioSesion = findViewById(R.id.IrInicioSesion);

        botonIrAInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un Intent para abrir la actividad "InicioSesionActivity"
                Intent intent = new Intent(MainActivity.this, InicioSesionActivity.class);
                startActivity(intent);
            }
        });
    }
}
