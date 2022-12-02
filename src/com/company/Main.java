package com.company;
/*
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main {

    public static void main(String[] args) {
        SmartDevice relojPolimorfo = new SmartWatch();
        SmartWatch relojOriginal = new SmartWatch(110, 3.2,"negro",
                21.3,"amarilla",2);
        SmartPhone movil1 = new SmartPhone(220, 13.5, "azul");
        System.out.println(relojPolimorfo);
        System.out.println(relojOriginal);
        System.out.println(movil1);
    }
}