package com.dh.main;

public class ReservaFacade {

    private VueloApi vueloApi;
    private EstadiaApi estadiaApi;

    public ReservaFacade(VueloApi vueloApi, EstadiaApi estadiaApi) {
        this.vueloApi = vueloApi;
        this.estadiaApi = estadiaApi;
    }

    public void procesarBusqueda(Vuelo vuelo, Estadia estadia){
        vueloApi.buscarVuelo(vuelo);
        estadiaApi.buscarVuelo(estadia);
    }
}
