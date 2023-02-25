package com.example.pm011ptarea12023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textViewResultado = findViewById(R.id.textViewResultado);

        // Obtener el objeto Intent que inició esta actividad y extraer el resultado
        Intent intent = getIntent();
        float resultado = intent.getFloatExtra("RESULTADO", 0.0f);

        // Mostrar el resultado en el TextView
        textViewResultado.setText("El resultado es: " + resultado);
    }
}