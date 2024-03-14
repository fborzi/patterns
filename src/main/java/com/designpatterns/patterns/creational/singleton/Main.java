package com.designpatterns.patterns.creational.singleton;

public class Main {
    /**
     * - CONTEXTO:
     * Supongamos que estamos en la serie Game of Thrones. En la serie,
     * el trono de hierro es el lugar donde se sienta el rey de los siete reinos.
     * No estaria correcto que cada casa tenga su propio trono de hierro o que este
     * cambie de ubicacion a antojo de cada rey.
     * - PROBLEMATICA:
     * La problematica surge cuando necesitamos que el trono de hierro sea unico y que
     * no cambie de ubicacion. Pero esto no impide que la familia que lo ocupa cambie.
     * - SOLUCION:
     * Se deberia aplicar el patron Singleton, esto implica que se deberia crear una
     * clase *Realm* que contenga el trono de hierro y la familia que lo ocupa. Luego
     * se deberia crear un metodo *getSingletonInstance* que retorne una instancia de
     * *Realm* y que reciba como parametros la ubicacion del trono de hierro y la familia
     * que lo ocupa. Luego se deberia crear un metodo *getThroneLocation* que retorne la
     * ubicacion del trono de hierro y un metodo *getKingsHouse* que retorne la familia
     * que lo ocupa. Por ultimo, se deberia crear un metodo *setKingsHouse* que modifique
     * la familia que ocupa el trono de hierro.
     * - CONCLUSION:
     * El patron Singleton es util cuando necesitamos que un objeto sea unico y que no
     * cambie, permitiendo modificar partes del mismo pero no creando mas objetos.
     */
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
