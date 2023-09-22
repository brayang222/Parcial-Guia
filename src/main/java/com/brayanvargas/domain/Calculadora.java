package com.brayanvargas.domain;

public class Calculadora {
    private String marca;
    public Calculadora(String marca) {
        this.marca = marca;
    }

    public static int Multiplicar(int...  numeros){
        int result = 1;
        for (int num : numeros){
            result*=num;
        }
        return result;
    }

}
