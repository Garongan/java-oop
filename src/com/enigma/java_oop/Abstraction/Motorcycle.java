package com.enigma.java_oop.Abstraction;

public class Motorcycle implements Vehicle{
    @Override
    public void run() {
        System.out.println("Motor bergerak");
    }

    @Override
    public void stop() {
        System.out.println("Motor berhenti");
    }

}
