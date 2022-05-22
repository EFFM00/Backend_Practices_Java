package com.dh.restaurante.main;

public class Vegetariano extends Menu {

    private Integer cantSalsas;
    private Boolean tieneEspecias;

    public Vegetariano(Double precioBase, Integer cantSalsas, Boolean tieneEspecias) {
        super(precioBase);
        if(cantSalsas>=0){
            this.cantSalsas = cantSalsas;
        }
        this.tieneEspecias = tieneEspecias;
    }

    public Integer getCantSalsas() {
        return cantSalsas;
    }

    public Boolean getTieneEspecias() {
        return tieneEspecias;
    }

    @Override
    public Double calcularPrecioVenta() {
        Double precioFinal = this.getPrecioBase();
        if(this.tieneEspecias){
            precioFinal += precioFinal*0.01;
        }

        if(this.cantSalsas>=1){
            precioFinal += (this.cantSalsas*2);
        }
        return precioFinal;
    }

    @Override
    public void armarMenu() {
        System.out.println("Armando Menú Vegetariano");
        calcularPrecioVenta();
        System.out.println("Menú listo\n- Menú Vegetariano\n- Costo base: " + this.getPrecioBase() + "\n- Cant " +
                "salsas: " + this.cantSalsas + "\n- Con especias: " + this.tieneEspecias + "\n- Costo final: " + this.calcularPrecioVenta() + "\n");
    }
}
