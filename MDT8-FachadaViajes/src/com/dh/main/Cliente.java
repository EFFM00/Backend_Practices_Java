package com.dh.main;

import java.util.Date;

public class Cliente {
    public static void main(String[] args) {

        VueloApi vueloApi = VueloApi.getInstance();

        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 05, 30), new Date(2022, 12, 21), "Buenos Aires","Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 06, 30), new Date(2022, 12, 21), "Buenos Aires",
                "Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 12, 30), new Date(2022, 12, 21), "Buenos Aires",
                "Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 07, 30), new Date(2022, 12, 21), "Buenos Aires",
                "Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 05, 30), new Date(2022, 12, 21), "Buenos Aires","Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 05, 30), new Date(2022, 12, 21), "Buenos Aires","Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 07, 30), new Date(2022, 12, 21), "Buenos Aires",
                "Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 05, 30), new Date(2022, 12, 21), "Buenos Aires","Panama"));
        vueloApi.agregarVuelosDisponibles(new Vuelo(new Date(2022, 10, 30), new Date(2022, 12, 21), "Buenos Aires",
                "Panama"));
    }


}
