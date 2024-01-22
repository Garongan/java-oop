package com.enigma.java_oop.Inheritance;

public class Mamals extends Animal {
    public void getBirth(){
        System.out.println("Mamals get birth");
    }

    @Override
    public void breathe() {
        super.breathe();
    }
}
