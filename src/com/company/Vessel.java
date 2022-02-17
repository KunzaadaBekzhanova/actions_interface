package com.company;

public class Vessel extends Vehicle implements Swimable{
    @Override
    public void underWater() {
        System.out.println("There is vessel can swim under water");
    }

    @Override
    public void aboveWater() {
        System.out.println("Vessel is going above");
    }

    @Override
    void move() {
        System.out.println("Vessel is moving");

    }

    @Override
    void ride() {
        System.out.println("Vessel is ridding");
    }
}
