package com.designpatterns.patterns.creational.abstractFactory;

import com.designpatterns.patterns.creational.abstractFactory.elements.goombas.Goomba;
import com.designpatterns.patterns.creational.abstractFactory.elements.koopas.Koopa;
import com.designpatterns.patterns.creational.abstractFactory.elements.marios.Mario;
import com.designpatterns.patterns.creational.abstractFactory.factories.MarioMakerFactory;

public class Game {
    private Goomba goomba;
    private Koopa koopa;
    private Mario mario;

    public Game(MarioMakerFactory factory) {
        goomba = factory.createGoomba();
        koopa = factory.createKoopa();
        mario = factory.createMario();
    }

    /**
     * Este metodo crea todos los elementos del juego a la vez,
     * Pero tranquilamente se podria implementar un metodo para
     * crear cada elemento por separado.
     */
    public void create() {
        goomba.create();
        koopa.create();
        mario.create();
    }

    public void createGoomba() {
        goomba.create();
    }
    public void createKoopa() {
        koopa.create();
    }
    public void createMario() {
        mario.create();
    }
}
