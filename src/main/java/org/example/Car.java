package org.example;

public class Car {

    String model="Merceses";
    String renk="Beyaz";
    String vites="otomatik";



    public static void motor(String guclu){
        System.out.println("motor = " + guclu);
    }

    public static void frenMesafesi(int a){
        System.out.println(500);
    }

    public Car(String model, String renk, String vites) {
        this.model = model;
        this.renk = renk;
        this.vites = vites;
    }


    public Car(String renk, String vites) {
        this.renk = renk;
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", vites='" + vites + '\'' +
                '}';
    }
}
