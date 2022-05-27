package com.dh.main;

import java.util.Date;

public class Vuelo {
    private Date fechaIda;
    private Date fechaVuelta;
    private String origen;
    private String destino;

    public Vuelo(Date fechaIda, Date fechaVuelta, String origen, String destino) {
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.origen = origen;
        this.destino = destino;
    }

    public Date getFechaIda() {
        return fechaIda;
    }

    public Date getFechaVuelta() {
        return fechaVuelta;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
