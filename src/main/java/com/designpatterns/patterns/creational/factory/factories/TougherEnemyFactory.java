package com.designpatterns.patterns.creational.factory.factories;

import com.designpatterns.patterns.creational.factory.enemies.Enemy;
import com.designpatterns.patterns.creational.factory.enemies.HammerBro;

public class TougherEnemyFactory extends EnemyFactory{
    @Override
    public Enemy createEnemies() {
        return new HammerBro();
    }
}
