package com.designpatterns.patterns.creational.abstractFactory.factories;

import com.designpatterns.patterns.creational.abstractFactory.elements.goombas.Goomba;
import com.designpatterns.patterns.creational.abstractFactory.elements.goombas.Goomba3D;
import com.designpatterns.patterns.creational.abstractFactory.elements.koopas.Koopa;
import com.designpatterns.patterns.creational.abstractFactory.elements.koopas.Koopa3D;
import com.designpatterns.patterns.creational.abstractFactory.elements.marios.Mario;
import com.designpatterns.patterns.creational.abstractFactory.elements.marios.Mario3D;

public class MarioMaker3DFactory implements MarioMakerFactory{
    @Override
    public Goomba createGoomba() {
        return new Goomba3D();
    }

    @Override
    public Koopa createKoopa() {
        return new Koopa3D();
    }

    @Override
    public Mario createMario() {
        return new Mario3D();
    }
}
