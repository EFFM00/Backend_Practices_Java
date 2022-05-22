package com.company;

public class Cuadrado {
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double calcularArea() {
        if(lado <= 0){
            throw new RuntimeException("El valor del radio o lado debe ser mayor que cero");
        }
        return Math.pow(lado, 2);
    }
}
