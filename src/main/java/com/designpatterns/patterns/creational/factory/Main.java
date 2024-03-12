package com.designpatterns.patterns.creational.factory;

import com.designpatterns.patterns.creational.factory.enemies.Enemy;
import com.designpatterns.patterns.creational.factory.factories.EnemyFactory;
import com.designpatterns.patterns.creational.factory.factories.RandomEnemyFactory;
import com.designpatterns.patterns.creational.factory.factories.TougherEnemyFactory;

public class Main {
    /**
     * TODO: Add description
     */
    public static void main(String[] args) {
        startNewGame("Franco", 2);
        System.out.println("----------------------");
        startNewGame("Florencia",1);
        System.out.println("----------------------");
        startNewGame("Fernando", 4);
    }

    public static void startNewGame(String player, Integer level){
        System.out.println("Welcome " + player + " to the game!");

        if(level <= 3){
            EnemyFactory enemyFactory = new RandomEnemyFactory();
            Enemy enemy = enemyFactory.createEnemies();
            enemy.attack();
        }else{
            EnemyFactory enemyFactory = new TougherEnemyFactory();
            Enemy enemy = enemyFactory.createEnemies();
            enemy.attack();
        }
    }
}
