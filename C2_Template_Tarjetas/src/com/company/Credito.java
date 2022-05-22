package com.company;

import java.util.Date;

public class Credito extends Tarjeta{

    private Double saldoUtilizado;
    public Credito(Integer numTarjeta, Integer codSeguridad, Date fechaExpiracion, Double saldoDisponible) {
        super(numTarjeta, codSeguridad, fechaExpiracion, saldoDisponible);
    }

}
