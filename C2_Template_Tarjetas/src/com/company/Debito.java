package com.company;

import java.util.Date;

public class Debito extends Tarjeta{

    public Debito(Integer numTarjeta, Integer codSeguridad, Date fechaExpiracion, Double saldoDisponible) {
        super(numTarjeta, codSeguridad, fechaExpiracion, saldoDisponible);
    }
}
