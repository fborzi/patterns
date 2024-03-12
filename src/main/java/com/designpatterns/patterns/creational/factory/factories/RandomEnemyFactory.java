package com.designpatterns.patterns.creational.factory.factories;

import com.designpatterns.patterns.creational.factory.enemies.Enemy;
import com.designpatterns.patterns.creational.factory.enemies.Goomba;
import com.designpatterns.patterns.creational.factory.enemies.HammerBro;
import com.designpatterns.patterns.creational.factory.enemies.Koopa;

public class RandomEnemyFactory extends EnemyFactory{

    private final Double randomNumber = Math.random();
    @Override
    public Enemy createEnemies() {
        if(randomNumber > 0.66){
            return new Goomba();
        }else if(randomNumber > 0.33){
            return new Koopa();
        }else {
            return new HammerBro();
        }
    }

    public Double getRandomNumber() {
        return randomNumber;
    }
}
