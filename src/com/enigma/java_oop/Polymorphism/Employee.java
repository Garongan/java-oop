package com.enigma.java_oop.Polymorphism;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println("Hello " + name + " saya karyawan " + this.name);
    }
}
