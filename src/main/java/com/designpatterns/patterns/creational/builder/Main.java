package com.designpatterns.patterns.creational.builder;

public class Main {
    /**
     * - CONTEXTO:
     * Supongamos que estamos creando autos 0km. Cada auto tiene una serie de
     * partes que lo componen, como el motor, la transmision, la cantidad de puertas y
     * si tienen baul, baul frontal o caja. Además, cada auto tiene un manual de usuario.
     * - PROBLEMATICA:
     * Al momento de construirlo, teniendo tantas variables, que se complicaria al tener
     * tantas variables en el constructor. Algunas variables corresponden a un auto y otras
     * a otro.
     * - SOLUCION:
     * Se deberia aplicar el patron Builder, esto implica que se deberia crear una interfaz
     * que contenga los metodos para construir el auto y un director que se encargue de
     * crear cada tipo de auto. Luego se deberia crear una clase CarBuilder que implemente
     * la interfaz y que se encargue de construir el auto. Por ultimo, se deberia crear una
     * clase CarManualBuilder que implemente la interfaz y que se encargue de construir el
     * manual de usuario. Ambas clases implementan los mismos metodos pero obtienen resultados
     * diferentes, ya que una construye el auto y la otra su manual.
     * - CONCLUSION:
     * El patron Builder es util cuando se tienen muchas variables en el constructor y
     * se quiere evitar tener un constructor con muchas variables.
     */
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.createEV(carBuilder);
        System.out.println("Created an " + carBuilder.getResult() + " car");
        director.createEV(manualBuilder);
        System.out.println(manualBuilder.getResult());

        System.out.println("----------------------------------------------");

        director.createSportsCar(carBuilder);
        System.out.println("Created a " + carBuilder.getResult() + " car");
        director.createSportsCar(manualBuilder);
        System.out.println(manualBuilder.getResult());

        System.out.println("----------------------------------------------");

        director.createTruck(carBuilder);
        System.out.println("Created a " + carBuilder.getResult() + " car");
        director.createTruck(manualBuilder);
        System.out.println(manualBuilder.getResult());

    }
}
