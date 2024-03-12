package com.designpatterns.patterns.creational.singleton;

public class Realm {
    private final String throneLocation;
    private String kingsHouse;
    private static Realm realm;

    /**
     * El constructor es privado, no permite que se genere un constructor por defecto.
      */
    private Realm(String throneLocation, String kingsHouse) {
        this.throneLocation = throneLocation;
        this.kingsHouse = kingsHouse;
        System.out.println("El trono está en: " + this.throneLocation);
        System.out.println("El rey es de la casa: " + this.kingsHouse);
    }

    public static Realm getSingletonInstance(String throneLocation, String kingsHouse) {
        if (realm == null){
            realm = new Realm(throneLocation, kingsHouse);
        }
        else{
            System.out.println("No se puede mover el trono de hierro a " + throneLocation + '\n');
        }

        return realm;
    }

    public String getThroneLocation() {
        return throneLocation;
    }

    public String getKingsHouse() {
        return kingsHouse;
    }

    public void setKingsHouse(String kingsHouse) {
        this.kingsHouse = kingsHouse;
    }
}
