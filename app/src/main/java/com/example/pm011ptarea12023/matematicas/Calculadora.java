package com.example.pm011ptarea12023.matematicas;

public class Calculadora {
    public static float suma(float a, float b) {
        return a + b;
    }

    public static float resta(float a, float b) {
        return a - b;
    }

    public static float multiplicacion(float a, float b) {
        return a * b;
    }

    public static float division(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return (float) a / b;
    }
}
