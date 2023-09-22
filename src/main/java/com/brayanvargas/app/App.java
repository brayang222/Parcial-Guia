package com.brayanvargas.app;

import com.brayanvargas.domain.Calculadora;

public class App {
    public static void main(String[] args) {
        double resultado = Calculadora.Multiplicar(10, 15, 10, 10);

        System.out.println(resultado);
    }
}
