package com.enigma.java_oop.Inheritance;

public class Cow extends Mammals {
    public void makeSound(){
        System.out.println("Moooo");
    }

    @Override
    public void breathe() {
        System.out.println("Cow is Breathing");
        super.breathe();
    }
}