package com.designpatterns.patterns.creational.factory.enemies;

public class Koopa extends Enemy{

        public Koopa() {
            setName("Koopa");
            setDamage(2);
        }

        @Override
        public void attack() {
            System.out.println("Koopa attacks");
            System.out.println("Player takes " + getDamage() + " damage.");
        }
}
