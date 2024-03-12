package com.designpatterns.patterns.creational.factory.enemies;

public class Goomba extends Enemy{

    public Goomba() {
        setName("Goomba");
        setDamage(1);
    }

    @Override
    public void attack() {
        System.out.println("Goomba attacks");
        System.out.println("Player takes " + getDamage() + " damage.");
    }
}
