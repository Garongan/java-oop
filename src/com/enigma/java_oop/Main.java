package com.enigma.java_oop;

public class Main {
    public static void main(String[] args) {
//        object is representation from class/blueprint
//        create the object is same of create variable
//        instance in java is creating the object
//        the instance is non-primitive
//        example

        Car bmw = new Car("BMW M3 GTR", "Blue White", 4, "NASN1235");

//        example passing argument to class with reassign
//        bmw.name = "BMW M3 GTR";
//        bmw.color = "Blue White";
//        bmw.wheel = 4;

        System.out.println(bmw.name);
        System.out.println(bmw.color);
        System.out.println(bmw.wheel);

//        example passing argument with constructor, that name is same with the class name
//        constructor will call when the object is created
        Car toyota = new Car("Toyota Supra GTR", "White", 4, "NASCAR2024");

//        example passing argument to class with reassign
//        toyota.name = "Toyota Supra";
//        toyota.color = "White";
//        toyota.wheel = 4;

        System.out.println(toyota.name);
        System.out.println(toyota.color);
        System.out.println(toyota.wheel);

//        how to call the method through the object
        toyota.start();
        bmw.stop();

//        using the array to object class
        String[][] carList =
        {
            {"Alpard", "Black", "4", "ASA45"},
            {"Fortuner", "White", "4", "BRO78"},
            {"Pajero", "Blue", "4", "SEN12"}
        };

        Car[] car = new Car[3];
        for (int i = 0; i < carList.length; i++) {
            car[i] = new Car(carList[i][0], carList[i][1], Integer.parseInt(carList[i][2]), carList[i][3]);
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].print());
        }

//        4 pillar OOP
        /*
        * Encapsulation
        * Inheritance
        * Polymorphism
        * Abstraction
        * */

    }
}
