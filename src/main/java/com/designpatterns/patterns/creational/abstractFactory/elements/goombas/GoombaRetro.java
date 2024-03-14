package com.designpatterns.patterns.creational.abstractFactory.elements.goombas;

public class GoombaRetro implements Goomba{
    @Override
    public void create() {
        System.out.println("Creating Retro Goomba");
    }
}
