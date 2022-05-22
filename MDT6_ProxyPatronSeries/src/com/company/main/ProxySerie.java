package com.company.main;

public class ProxySerie implements ISerie{

    private Serie serie;
    private Integer cantVistas;

    public ProxySerie() {
        this.serie = new Serie();
        this.cantVistas = 0;
    }

    @Override
    public String getSerie(String titulo) throws SerieNoHabilitadaException{

        if (cantVistas<5){
            cantVistas++;
            System.out.println("Cant. de peticiones: " + cantVistas);
            System.out.println(this.serie.getSerie(titulo));
        } else{
            throw new SerieNoHabilitadaException("Ha superado la cantidad de reproducciones permitidas");
        }
        return null;
    }
}
