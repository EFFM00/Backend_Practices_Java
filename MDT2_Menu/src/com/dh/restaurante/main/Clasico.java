package com.dh.restaurante.main;

public class Clasico extends Menu {

    public Clasico(Double precioBase) {
        super(precioBase);
    }

    @Override
    public Double calcularPrecioVenta() {
        return super.getPrecioBase();
    }

    @Override
    public void armarMenu() {
        System.out.println("Armando Menú Clásico");
        System.out.println("Menú armado\n- Menú Clasico\n- Costo final: " + this.getPrecioBase() + "\n");
    }

}
