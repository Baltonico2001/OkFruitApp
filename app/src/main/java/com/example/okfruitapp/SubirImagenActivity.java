package com.example.okfruitapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SubirImagenActivity extends AppCompatActivity {

    private String frutaSeleccionada; // Variable para almacenar la fruta seleccionada

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subir_imagen);

        ImageButton btnRegresar = findViewById(R.id.Regresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cierra esta actividad y regresa a la actividad anterior
                finish();
            }
        });

        Spinner spinnerFruits = findViewById(R.id.spinnerFruits);
        Button subirButton = findViewById(R.id.Subir);

        // Definir las opciones del Spinner
        String[] fruits = {"Cerezas", "Arándanos"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fruits);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerFruits.setAdapter(adapter);

        spinnerFruits.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Obtener la opción seleccionada
                frutaSeleccionada = (String) parentView.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Manejar el caso en que no se seleccione nada
            }
        });

        subirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verificar si se ha seleccionado una fruta
                if (frutaSeleccionada != null && !frutaSeleccionada.isEmpty()) {
                    // Mostrar el mensaje "Carga exitosa"
                    Toast.makeText(SubirImagenActivity.this, "Carga Exitosa", Toast.LENGTH_SHORT).show();
                } else {
                    // Si no se ha seleccionado una fruta, mostrar un mensaje de error
                    Toast.makeText(SubirImagenActivity.this, "Por favor, selecciona una fruta", Toast.LENGTH_SHORT).show();
                }
            }
        });


        Button botonIrResultadoAnalisis = findViewById(R.id.IrResultadoAnalisis);

        botonIrResultadoAnalisis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un Intent para abrir la actividad "InicioSesionActivity"
                Intent intent = new Intent(SubirImagenActivity.this, ResultadoAnalisisActivity.class);
                startActivity(intent);
            }
        });
    }
}
