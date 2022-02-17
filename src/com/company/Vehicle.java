package com.company;

public abstract class Vehicle {
    private String model;
    private String type;
    private int since;
    private int speed;

    abstract void move();
    abstract void ride();
}
