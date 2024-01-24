package com.enigma.java_oop.Polymorphism;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + " saya manager " + this.name);
    }
}
