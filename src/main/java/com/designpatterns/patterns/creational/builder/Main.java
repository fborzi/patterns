package com.designpatterns.patterns.creational.builder;

public class Main {
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
