package com.company;

public class Plane extends Vehicle implements Flyable{
    @Override
    public void placeflying() {
        System.out.println("Plane cannot fly frm the place");

    }

    @Override
    public void airport() {
        System.out.println("Plane fly frm the airport");

    }

    @Override
    void move() {
        System.out.println("Plane is moving");

    }

    @Override
    void ride() {
        System.out.println("Plane is not ridding");
    }
}
