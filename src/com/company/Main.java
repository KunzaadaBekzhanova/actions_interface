package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle vessel = new Vessel();
        Vehicle plane = new Plane();

        Vehicle[] vehicles = {car, vessel, plane};
        System.out.println("        ***\nAbstract class is working...\n------------------");
        for (Vehicle v : vehicles) {
            v.ride();
            v.move();
        }
        System.out.println("        ***\nInterface is working...\n------------------");
        Swimable swimable = new Vessel();
        swimable.aboveWater();
        swimable.underWater();

        Runable runable = new Car();
        runable.kargo();
        runable.racing();

        Flyable flyable = new Plane();
        flyable.airport();
        flyable.placeflying();

    }
}
