package com.designpatterns.patterns.creational.abstractFactory.factories;

import com.designpatterns.patterns.creational.abstractFactory.elements.goombas.Goomba;
import com.designpatterns.patterns.creational.abstractFactory.elements.koopas.Koopa;
import com.designpatterns.patterns.creational.abstractFactory.elements.marios.Mario;

public interface MarioMakerFactory {
    Goomba createGoomba();
    Koopa createKoopa();
    Mario createMario();
}
