package com.designpatterns.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        //Realm realm = new Realm();

        Realm realm = Realm.getSingletonInstance("King's Landing", "Targaryen");

        Realm newRealm = Realm.getSingletonInstance("Winterfell", "Stark");

        /**
         * Por mas que se intente modificar la ubicacion del trono de hierro, queda siempre en el mismo lugar.
         * Pero si podriamos modificar la familia si queremos.
         */

        System.out.println("Lugar y Familia actuales\n");

        System.out.println(realm.getThroneLocation());
        System.out.println(realm.getKingsHouse() + '\n');

        //System.out.println(newRealm.getThroneLocation());
        //System.out.println(newRealm.getKingsHouse()  + '\n');

        System.out.println("Lugar y Familia actuales\n");
        realm.setKingsHouse("Baratheon");
        System.out.println(realm.getThroneLocation());
        System.out.println(realm.getKingsHouse());

    }
}
