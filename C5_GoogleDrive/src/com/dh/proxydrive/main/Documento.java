package com.dh.proxydrive.main;

import java.util.ArrayList;
import java.util.List;

public class Documento {

    private Integer id;
    private String url;
    private String contenido;
    private List listaUsuario;

    public Documento(Integer id, String url, String contenido, List listaUsuario) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.listaUsuario = new ArrayList()<>;
    }
}
