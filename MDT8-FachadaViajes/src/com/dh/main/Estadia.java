package com.dh.main;

import java.util.Date;

public class Estadia {

    private Date fechaIda;
    private Date fechaVuelta;
    private String ciudad;

    public Estadia(Date fechaIda, Date fechaVuelta, String ciudad) {
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.ciudad = ciudad;
    }

    public Date getFechaIda() {
        return fechaIda;
    }

    public Date getFechaVuelta() {
        return fechaVuelta;
    }

    public String getCiudad() {
        return ciudad;
    }
}
