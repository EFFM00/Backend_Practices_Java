package com.company;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Tarjeta {
    private Integer numTarjeta;
    private Integer codSeguridad;
    private Date fechaExpiracion;
    private Double saldoDisponible;

    public Tarjeta(Integer numTarjeta, Integer codSeguridad, Date fechaExpiracion, Double saldoDisponible) {
        this.numTarjeta = numTarjeta;
        this.codSeguridad = codSeguridad;
        this.fechaExpiracion = fechaExpiracion;
        this.saldoDisponible = saldoDisponible;
    }

    public Date getFechaExpiracion(){
        return this.fechaExpiracion;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }
}
