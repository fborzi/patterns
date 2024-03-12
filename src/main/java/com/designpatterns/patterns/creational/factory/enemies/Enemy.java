package com.designpatterns.patterns.creational.factory.enemies;

public abstract class Enemy {
    private String name;
    private int damage;

    public abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
