package com.company.main;

public class Main {
    public static void main(String[] args){
        System.out.println("Hola");

        ProxySerie proxy = new ProxySerie();

        try{
            proxy.getSerie("Prueba");
            proxy.getSerie("Prueba1");
            proxy.getSerie("Prueba2");
            proxy.getSerie("Prueba3");
            proxy.getSerie("Prueba4");
            proxy.getSerie("Prueba5");
            proxy.getSerie("Prueba5");

        } catch (SerieNoHabilitadaException e) {
            System.err.println("Error");
        }

    }
}
