package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CirculoTest {

    @Test
    public void valoresMenoresACero(){
        Circulo circulo = new Circulo(3.14);
        Circulo circuloNegativo = new Circulo(-3.14);

        assertEquals(30.974846927333925, circulo.calcularArea());
        assertEquals("com.company.Circulo@345965f2", circuloNegativo);
    }

}