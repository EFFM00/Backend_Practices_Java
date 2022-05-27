package com.dh.main;

import java.util.HashMap;

public class EstadiaApi {

    private static EstadiaApi instance;

    private HashMap<String, Estadia> hotelesDisponibles = new HashMap<>();

    private EstadiaApi() {
    }

    public static EstadiaApi getInstance() {
        if(instance==(null)){
            instance = new EstadiaApi();
        }
        return instance;
    }

    public Estadia buscarVuelo(Estadia estadiaSolicitada){
        String clave =
                "Clave: " + estadiaSolicitada.getFechaIda() + estadiaSolicitada.getFechaVuelta() + estadiaSolicitada.getCiudad();
        if(hotelesDisponibles.containsKey(clave)){
            System.out.println("La búsqueda arrojó los siguientes resultados: ");
            return estadiaSolicitada;
        } else {
            System.out.println("Lo sentimos, no hay hoteles disponibles para su búsqueda");
            return null;
        }
    }

    //Es públicos por fines prácticos, pero podría utilizarlo otra clase que maneje la disponibilidad de vuelos
    public void agregarVuelosDisponibles(Estadia estadia) {
        String clave = "Clave: " + estadia.getFechaIda() + estadia.getFechaVuelta() + estadia.getCiudad();
        hotelesDisponibles.put(clave, estadia);
    }
}
