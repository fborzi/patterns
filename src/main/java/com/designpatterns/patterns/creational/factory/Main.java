package com.designpatterns.patterns.creational.factory;

import com.designpatterns.patterns.creational.factory.enemies.Enemy;
import com.designpatterns.patterns.creational.factory.factories.EnemyFactory;
import com.designpatterns.patterns.creational.factory.factories.RandomEnemyFactory;
import com.designpatterns.patterns.creational.factory.factories.TougherEnemyFactory;

public class Main {
    /**
     * - CONTEXTO:
     * Supongamos el juego de Mario Bros, en donde necesitemos crear enemigos
     * de manera aleatoria. A medida que un jugador avanza de nivel, los enemigos ya no
     * estan siendo un reto para el jugador. Por lo que necesitamos crear enemigos mas
     * dificiles.
     * - PROBLEMATICA:
     * La problematica surge cuando necesitamos crear enemigos de manera
     * aleatoria o enemigos mas dificiles. Porque un jugador con mucho nivel, puede
     * superar facilmente los enemigos creados de manera aleatoria, por lo que necesitariamos
     * crear enemigos mas dificiles. Pero si un jugador con poco nivel, se enfrenta a enemigos
     * mas dificiles, no podra superarlos.
     * - SOLUCION:
     * Se deberia aplicar el patron Factory, esto implica que se podria implementar diferentes
     * maneras de crear enemigos. Esto se logra a travez de una clase abstracta *EnemyFactory*,
     * la cual tiene un metodo que crea enemigos. Luego se deberia crear una clase *RandomEnemyFactory*
     * que extienda de esa clase y cree enemigos aleatorios y una clase *TougherEnemyFactory* que
     * extienda de esa clase y cree enemigos mas dificiles.
     * Luego crear una clase abstracta *Enemy* que contenga metodos propios de los enemigos y tres
     * clases concretas de enemigos que extiendan de esa clase. Cada enemigo tendra un metodo *attack*
     * que sera implementado de manera diferente.
     * - CONCLUSION:
     * El patron Factory es util cuando necesitamos implementar diferentes formas de crear objetos.
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
