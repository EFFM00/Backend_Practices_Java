package com.dh.contactosFile;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String name;
    private String email;
    private String cell;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Contacto(String name, String email, String cell) {
        this.name = name;
        this.email = email;
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cell='" + cell + '\'' +
                '}';
    }
}
