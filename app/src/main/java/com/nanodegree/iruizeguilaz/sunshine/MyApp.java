package com.nanodegree.iruizeguilaz.sunshine;

import android.app.Application;

/**
 * Created by iruizeguilaz on 20/06/2015.
 */
public class MyApp extends Application {

    private String coordenadas;

    public String getCoordenadas(){
        return coordenadas;
    }
    public void setCoordenadas(String s){
        coordenadas = s;
    }
}

