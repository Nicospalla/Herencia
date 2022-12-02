package com.company;

public abstract class SmartDevice {
    //atributos
    int voltageCargador;
    double pixelPantalla;
    String color;
    //constructores

    public SmartDevice(){}

    public SmartDevice(int voltageCargador, double pixelPantalla, String color) {
        this.voltageCargador = voltageCargador;
        this.pixelPantalla = pixelPantalla;
        this.color = color;
    }

    //metodos
    public void encencer(){
        System.out.println("El equipo se esta encendiendo");
    }


}
