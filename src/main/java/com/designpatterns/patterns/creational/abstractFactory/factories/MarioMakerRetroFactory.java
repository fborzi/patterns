package com.designpatterns.patterns.creational.abstractFactory.factories;

import com.designpatterns.patterns.creational.abstractFactory.elements.goombas.Goomba;
import com.designpatterns.patterns.creational.abstractFactory.elements.goombas.GoombaRetro;
import com.designpatterns.patterns.creational.abstractFactory.elements.koopas.Koopa;
import com.designpatterns.patterns.creational.abstractFactory.elements.koopas.KoopaRetro;
import com.designpatterns.patterns.creational.abstractFactory.elements.marios.Mario;
import com.designpatterns.patterns.creational.abstractFactory.elements.marios.MarioRetro;

public class MarioMakerRetroFactory implements MarioMakerFactory{
    @Override
    public Goomba createGoomba() {
        return new GoombaRetro();
    }

    @Override
    public Koopa createKoopa() {
        return new KoopaRetro();
    }

    @Override
    public Mario createMario() {
        return new MarioRetro();
    }
}
