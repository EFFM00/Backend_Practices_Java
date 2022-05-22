package com.dh.restaurante.main;

public class Main {
    public static void main (String [] args) {

        Clasico clasico = new Clasico(5.0);

        clasico.armarMenu();

        Vegetariano vegetariano = new Vegetariano(7.0, 2, true);
        Vegetariano vegetariano2 = new Vegetariano(7.0, 0, false);
        Vegetariano vegetariano3 = new Vegetariano(7.0, 3, false);
        Vegetariano vegetariano4 = new Vegetariano(7.0, 0, true);

        vegetariano.armarMenu();
        vegetariano2.armarMenu();
        vegetariano3.armarMenu();
        vegetariano4.armarMenu();

        Infantil infantil = new Infantil(5.0, 1);
        Infantil infantil2 = new Infantil(5.0, 3);
        Infantil infantil3 = new Infantil(5.0, 0);

        infantil.armarMenu();
        infantil2.armarMenu();
        infantil3.armarMenu();

    }
}
