package com.company;

public class Circulo {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double calcularArea() {
        if(radio <= 0){
            throw new RuntimeException("“El valor del radio o lado debe ser mayor que cero");
        }
        return Math.PI * Math.pow(radio, 2);
    }
}
