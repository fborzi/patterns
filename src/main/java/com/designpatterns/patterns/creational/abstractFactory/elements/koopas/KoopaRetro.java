package com.designpatterns.patterns.creational.abstractFactory.elements.koopas;

public class KoopaRetro implements Koopa{
    @Override
    public void create() {
        System.out.println("Creating Retro Koopa");
    }
}
