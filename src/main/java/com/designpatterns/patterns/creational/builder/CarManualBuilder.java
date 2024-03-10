package com.designpatterns.patterns.creational.builder;

public class CarManualBuilder implements Builder{

    private String carType;
    private int door;
    private String engine;
    private String transmission;
    private boolean frunk;
    private boolean trunk;
    private boolean truckBed;


    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public void hasFrunk(boolean frunk) {
        this.frunk = frunk;
    }

    @Override
    public void hasTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    @Override
    public void hasTruckBed(boolean truckBed) {
        this.truckBed = truckBed;
    }

    public String getResult(){
        return "Car type: " + carType + "\n" +
                "Door: " + door + "\n" +
                "Engine: " + engine + "\n" +
                "Transmission: " + transmission + "\n" +
                "Frunk: " + frunk + "\n" +
                "Trunk: " + trunk + "\n" +
                "Truck bed: " + truckBed;
    }
}
