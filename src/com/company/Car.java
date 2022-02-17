package com.company;

public class Car extends Vehicle implements Runable{
    @Override
    public void racing() {
        System.out.println("Car can racing");

    }

    @Override
    public void kargo() {
        System.out.println("Car can carry heavy things");

    }

    @Override
    void move() {
        System.out.println("Car is moving");

    }

    @Override
    void ride() {
        System.out.println("Car is ridding");
    }
}
