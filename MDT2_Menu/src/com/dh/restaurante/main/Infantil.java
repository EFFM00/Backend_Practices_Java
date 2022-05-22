package com.dh.restaurante.main;

public class Infantil extends Menu {

    private Integer cantJuguete;

    public Infantil(Double precioBase, Integer cantJuguete) {
        super(precioBase);

        if(cantJuguete>=0){
            this.cantJuguete = cantJuguete;
        }
    }

    public Integer getCantJuguete() {
        return cantJuguete;
    }

    public Integer precioJuguetes(){
        return this.cantJuguete*3;
    }
    @Override
    public Double calcularPrecioVenta() {
        return this.getPrecioBase()+precioJuguetes();
    }

    @Override
    public void armarMenu() {
        System.out.println("Preparando menú Infantil");
        System.out.println("Menú armado\n- Menú Infantil\n- Cantidad juguetes: " + this.cantJuguete + "\n- Costo " +
                "adicional juguetes: " + this.precioJuguetes() + "\n- Precio final: " + this.getPrecioBase() + "\n");
    }
}
