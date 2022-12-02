package com.company;

public class SmartPhone extends SmartDevice{
    //atributos
    boolean traeFunda;
    //constructores

    public SmartPhone(int voltageCargador, double pixelPantalla, String color) {
        super(voltageCargador, pixelPantalla, color);
    }

    public SmartPhone(int voltageCargador, double pixelPantalla, String color, boolean traeFunda) {
        super(voltageCargador, pixelPantalla, color);
        this.traeFunda = traeFunda;
    }
    //metodos
    public void marcacionRapida(){
        System.out.println("llamando al 911");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "voltageCargador=" + voltageCargador +
                ", pixelPantalla=" + pixelPantalla +
                ", color='" + color + '\'' +
                ", traeFunda=" + traeFunda +
                '}';
    }
}
