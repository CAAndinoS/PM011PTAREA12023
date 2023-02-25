package com.example.pm011ptarea12023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm011ptarea12023.matematicas.Calculadora;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumero1, editTextNumero2;
    Button buttonSumar, buttonRestar, buttonMultiplicar, buttonDividir;
    private Button buttonIgual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        buttonSumar = findViewById(R.id.buttonSumar);
        buttonRestar = findViewById(R.id.buttonRestar);
        buttonMultiplicar = findViewById(R.id.buttonMultiplicar);
        buttonDividir = findViewById(R.id.buttonDividir);

        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suma();
            }
        });
        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resta();
            }
        });
        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplicacion();
            }
        });
        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Divicion();
            }
        });
    }
    private void Suma() {
        String valor1 = editTextNumero1.getText().toString();
        String valor2 = editTextNumero2.getText().toString();
        if (valor1.isEmpty() || valor2.isEmpty()) {
            Validacion();
        }else{
            float numero1 = Float.parseFloat(valor1);
            float numero2 = Float.parseFloat(valor2);

            float resultado = Calculadora.suma( numero1,  numero2);
            Intent intent = new Intent(getApplicationContext(), resultado.class);
            intent.putExtra("RESULTADO", resultado);
            startActivity(intent);
        }
    }
    private void Resta() {
        String valor1 = editTextNumero1.getText().toString();
        String valor2 = editTextNumero2.getText().toString();
        if (valor1.isEmpty() || valor2.isEmpty()) {
            Validacion();
        }else{
            float numero1 = Float.parseFloat(valor1);
            float numero2 = Float.parseFloat(valor2);

            float resultado = Calculadora.resta( numero1,  numero2);
            Intent intent = new Intent(getApplicationContext(), resultado.class);
            intent.putExtra("RESULTADO", resultado);
            startActivity(intent);
        }
    }
    private void Multiplicacion() {
        String valor1 = editTextNumero1.getText().toString();
        String valor2 = editTextNumero2.getText().toString();
        if (valor1.isEmpty() || valor2.isEmpty()) {
            Validacion();
        }else{
            float numero1 = Float.parseFloat(valor1);
            float numero2 = Float.parseFloat(valor2);

            float resultado = Calculadora.multiplicacion( numero1,  numero2);
            Intent intent = new Intent(getApplicationContext(), resultado.class);
            intent.putExtra("RESULTADO", resultado);
            startActivity(intent);
        }
    }
    private void Divicion() {
        String valor1 = editTextNumero1.getText().toString();
        String valor2 = editTextNumero2.getText().toString();
        if (valor1.isEmpty() || valor2.isEmpty()) {
            Validacion();
        }else{
            float numero1 = Float.parseFloat(valor1);
            float numero2 = Float.parseFloat(valor2);

            float resultado = Calculadora.division( numero1,  numero2);
            Intent intent = new Intent(getApplicationContext(), resultado.class);
            intent.putExtra("RESULTADO", resultado);
            startActivity(intent);
        }
    }
    private void Validacion() {
        String valor1 = editTextNumero1.getText().toString();
        String valor2 = editTextNumero2.getText().toString();

        if (valor1.isEmpty() || valor2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Ingresa ambos valores", Toast.LENGTH_SHORT).show();

        }

    }
}
