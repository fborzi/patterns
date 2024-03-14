package com.designpatterns.patterns.creational.abstractFactory.elements.marios;

public class MarioRetro implements Mario{
    @Override
    public void create() {
        System.out.println("Creating Retro Mario");
    }
}
