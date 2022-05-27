package com.dh.main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class VueloApi {

    private static VueloApi instance;

    private HashMap<String, Vuelo> vuelosDisponibles = new HashMap<>();

    private VueloApi() {
    }

    public static VueloApi getInstance() {
        if(instance==(null)){
            instance = new VueloApi();
        }
        return instance;
    }

    public Vuelo buscarVuelo(Vuelo vueloSolicitado){
        String clave = "Clave: " + vueloSolicitado.getFechaIda() + vueloSolicitado.getFechaVuelta() + vueloSolicitado.getOrigen() + vueloSolicitado.getDestino();
        if(vuelosDisponibles.containsKey(clave)){
            System.out.println("La búsqueda arrojó los siguientes resultados: ");
            return vueloSolicitado;
        } else {
            System.out.println("Lo sentimos, no hay vuelos disponibles para su búsqueda");
            return null;
        }
    }

    //Es públicos por fines prácticos, pero podría utilizarlo otra clase que maneje la disponibilidad de vuelos
    public void agregarVuelosDisponibles(Vuelo vuelo) {
        String clave = "Clave: " + vuelo.getFechaIda() + vuelo.getFechaVuelta() + vuelo.getOrigen() + vuelo.getDestino();
        vuelosDisponibles.put(clave, vuelo);
    }
}
