package com.company;

import java.util.Date;

public abstract class Pago {
    private Double monto;
    Tarjeta tarjetaCobro;

    public Pago(Double monto, Tarjeta tarjetaCobro) {
        this.monto = monto;
        this.tarjetaCobro = tarjetaCobro;
    }

    protected Boolean comprobarFecha() {
        Date fechaHoy = new Date();
        if (tarjetaCobro.getFechaExpiracion().before(fechaHoy)){
            return false;
        }
        return true;
    }

    public Double getMonto() {
        return monto;
    }

    public Tarjeta getTarjetaCobro() {
        return tarjetaCobro;
    }

    public abstract Boolean darAutorizacion();
}
