package com.company;

public class SmartWatch extends SmartDevice{
    //atributos
    double anchoPulsera;
    String colorPulsera;
    int nivelConectividad;
    //constructores


    public SmartWatch() {
    }

    public SmartWatch(int voltageCargador, double pixelPantalla, String color) {
        super(voltageCargador, pixelPantalla, color);
    }

    public SmartWatch(int voltageCargador, double pixelPantalla,
                      String color, double anchoPulsera, String colorPulsera, int nivelConectividad) {
        super(voltageCargador, pixelPantalla, color);
        this.anchoPulsera = anchoPulsera;
        this.colorPulsera = colorPulsera;
        this.nivelConectividad = nivelConectividad;
    }

    //metodos
    public void tomarFrecuenciaCardiaca(){
        System.out.println("Usted no morira hoy");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "voltageCargador=" + voltageCargador +
                ", pixelPantalla=" + pixelPantalla +
                ", color='" + color + '\'' +
                ", anchoPulsera=" + anchoPulsera +
                ", colorPulsera='" + colorPulsera + '\'' +
                ", nivelConectividad=" + nivelConectividad +
                '}';
    }
}
