package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuadradoTest {
    @Test
    public void valoresMenoresACero(){
        Cuadrado cuadrado = new Cuadrado(3.14);
        Cuadrado cuadradoNegativo = new Cuadrado(-3.14);

        assertEquals(30.974846927333925, cuadrado.calcularArea());
        assertEquals("com.company.Circulo@345965f2", cuadradoNegativo.calcularArea());
    }
}