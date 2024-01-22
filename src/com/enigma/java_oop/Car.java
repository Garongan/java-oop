package com.enigma.java_oop;

public class Car {

    //    instance variable or atribute
    public String name;
    public String color;
    public Integer wheel;
    private String serialNumber;

    public Car(String name, String color, Integer wheel, String serialNumber) {
        this.name = name;
        this.color = color;
        this.wheel = wheel;
        this.serialNumber = serialNumber;
    }

    public void start() {
        System.out.println("vroom");
    }

    public void stop() {
        System.out.println("ngittt");
    }

    public String print() {
        return "Car { "
                + "name " + name
                + ", color = " + color
                + ", wheel = " + wheel
                + ", serial number = " + serialNumber
                + " }";
    }
}
