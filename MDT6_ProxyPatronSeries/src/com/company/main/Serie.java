package com.company.main;

public class Serie implements ISerie{

    @Override
    public String getSerie(String serie) {
        return "www.dhpelis.com.ar/series/" + serie;
    }
}
