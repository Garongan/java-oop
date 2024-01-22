package com.enigma.java_oop;

public class Car {
    //    instance variable or atribute
    public String name;
    public String color;
    public Integer wheel;
    private String serialNumber;
    private Integer fuel;

    public Car(String name, String color, Integer wheel, String serialNumber) {
        this.name = name;
        this.color = color;
        this.wheel = wheel;
        this.serialNumber = serialNumber;
        this.fuel = 0;
    }

    public void fillFuel(Integer fuel) {
        if (fuel > 30) {
            System.out.println("sudah penuh");
        } else if (fuel < 0) {
            System.out.println("tidak bisa mengisi dengan angka minus");
        } else {
            this.fuel += fuel;

        }
    }

    public Integer getFuel() {
        return fuel;
    }

//    check if the setter is being needed
//    public void setFuel(Integer fuel) {
//        this.fuel = fuel;
//    }

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
                + ", fuel = " + fuel
                + " }";
    }
}
