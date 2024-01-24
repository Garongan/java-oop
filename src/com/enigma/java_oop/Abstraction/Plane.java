package com.enigma.java_oop.Abstraction;

public class Plane implements Vehicle, FlyAble{
    @Override
    public void run() {
        System.out.println("Plane is Flying");
    }

    @Override
    public void stop() {
        System.out.println("Plane is Landing");
    }

    @Override
    public void fly() {
        System.out.println("Plane can Fly");
    }
}
