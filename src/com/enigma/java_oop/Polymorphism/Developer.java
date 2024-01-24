package com.enigma.java_oop.Polymorphism;

public class Developer extends Manager {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + " saya developer " + this.name);
    }
}
