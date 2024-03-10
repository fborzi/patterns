package com.designpatterns.patterns.creational.builder;

public interface Builder {
    void setCarType(String carType);
    void setDoor(int door);
    void setEngine(String engine);
    void setTransmission(String transmission);
    void hasFrunk(boolean frunk);
    void hasTrunk(boolean trunk);
    void hasTruckBed(boolean truckBed);

}
