package com.dh.restaurante.main;

public abstract class Menu {

    private Double precioBase;

    public Menu(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public abstract Double calcularPrecioVenta();
    public abstract void armarMenu();
}
