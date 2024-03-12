package com.designpatterns.patterns.creational.factory.enemies;

public class HammerBro extends Enemy{

        public HammerBro() {
            setName("Hammer Bro");
            setDamage(3);
        }

        @Override
        public void attack() {
            System.out.println("Hammer Bro attacks");
            System.out.println("Player takes " + getDamage() + " damage.");
        }
}
