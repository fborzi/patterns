package com.designpatterns.patterns.creational.builder;

public class Director {

    public void createEV(Builder builder){
        builder.setCarType("EV");
        builder.setEngine("Single Speed Gear Box");
        builder.setTransmission("Automatic");
        builder.setDoor(4);
        builder.hasFrunk(true);
        builder.hasTrunk(true);
        builder.hasTruckBed(false);
    }

    public void createSportsCar(Builder builder){
        builder.setCarType("Sports Car");
        builder.setEngine("V8");
        builder.setTransmission("Manual");
        builder.setDoor(2);
        builder.hasFrunk(false);
        builder.hasTrunk(false);
        builder.hasTruckBed(false);
    }

    public void createTruck(Builder builder){
        builder.setCarType("Truck");
        builder.setEngine("V8");
        builder.setTransmission("Automatic");
        builder.setDoor(4);
        builder.hasFrunk(false);
        builder.hasTrunk(false);
        builder.hasTruckBed(true);
    }
}
