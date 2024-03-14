package com.designpatterns.patterns.creational.abstractFactory;

import com.designpatterns.patterns.creational.abstractFactory.factories.MarioMaker3DFactory;
import com.designpatterns.patterns.creational.abstractFactory.factories.MarioMakerFactory;
import com.designpatterns.patterns.creational.abstractFactory.factories.MarioMakerRetroFactory;

public class Main {

    /**
     * - CONTEXTO:
     * Supongamos que tenemos que crear un mapa de Mario Bros pero lo estamos haciendo
     * a traves del Super Mario Maker 2, el cual nos permite crear mapas de Mario Bros
     * con estilo retro.
     * - PROBLEMATICA:
     * Que pasaria si queremos cambiar el estilo del juego a algo mas moderno, como el 3D?
     * El jugador que haya hecho su mapa en estilo retro y necesite incorporar un nuevo
     * elemento, al crearlo, obtendria un elemento en estilo 3D, lo cual no concuerda con
     * el estilo del mapa actual.
     * Esto se repetiria cada vez que necesitemos cambiar de estilo del juego.
     * - SOLUCION:
     * Se deberia aplicar el patron Abstract Factory, esto implica que se deberia crear
     * una interfaz *MarioMakerFactory* que contenga los metodos para crear cada elemento
     * del juego. Luego se deberia crear una clase *MarioMakerRetroFactory* que implemente
     * esa interfaz y que se encargue de crear cada elemento del juego en estilo retro y
     * una clase *MarioMaker3DFactory* que implemente esa interfaz y que se encargue de
     * crear cada elemento del juego en estilo 3D.
     * Ademas, cada elemento del juego deberia tener una interfaz (por ejemplo, *Goomba*,
     * *Koopa* o *Mario*) que contenga los metodos para crear clases concretas. Luego se
     * deberia crear una clase concreta para cada elemento del juego (por ejemplo, *GoombaRetro*,
     * *KoopaRetro* o *MarioRetro*) que implemente esa interfaz y que se encargue de crear
     * el elemento del juego.
     * Por ultimo, se deberia crear una clase *Game* que tenga todos los elementos del juego,
     * que reciba como parametro una instancia de *MarioMakerFactory* permitiendole recibir
     * el estilo con el cual se va a crear el juego.
     * - CONCLUSION:
     */
    public static void main(String[] args) {
        Game startNewGame = newGame("Retro");
        //Game startNewGame = newGame("3D");
        
        if(startNewGame != null){
            startNewGame.create();
        }else{
            System.out.println("Invalid game style");
        }

    }

    private static Game newGame(String style){
        Game game;
        MarioMakerFactory factory;

        if(style.equals("Retro")){
            factory = new MarioMakerRetroFactory();
        }else if(style.equals("3D")){
            factory = new MarioMaker3DFactory();
        }else{
            return null;
        }
        game = new Game(factory);
        return game;
    }
}
