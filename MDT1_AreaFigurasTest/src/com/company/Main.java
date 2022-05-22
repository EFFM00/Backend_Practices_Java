package com.company;

public class Main {
    public static void main (String [] args) throws Exception {
        Circulo circulo = new Circulo(0.0);
        Cuadrado cuadrado = new Cuadrado(6.7);

        System.out.println(circulo.calcularArea());
    }
}
