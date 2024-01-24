package com.enigma.java_oop;

import com.enigma.java_oop.Abstraction.*;
import com.enigma.java_oop.object_interaction.Hero;
import com.enigma.java_oop.object_interaction.Monster;

public class Main {
    public static void main(String[] args) {
//        class abstract can't be instance
        Shape shape = new Square(12.0);
        System.out.println(shape.getCircumference() + " m");
        System.out.println(shape.getSurface() + " m2");

        Shape triangle = new Triangle(5.0, 10.0);
        var resultCircumference = triangle.getCircumference();
        var resultSurface = triangle.getSurface();

        System.out.println(resultCircumference);
        System.out.println(resultSurface);

        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(4.0);
        shapes[1] = new Triangle(3.0, 4.0);

        for (Shape index: shapes){
            System.out.println(index.getSurface());
        }

//        anonymous class
        Shape shape1 = new Shape() {
            @Override
            public Double getCircumference() {
                return null;
            }

            @Override
            public Double getSurface() {
                return null;
            }
        };

//        interface class
        Vehicle motor = new Motorcycle();
        motor.run();
        motor.stop();

        FlyAble[] flyAble = new FlyAble[2];
        flyAble[0] = new Plane();


        System.out.println("===Interface in Heroes and Monster===");

        Hero cahaya = new Hero("Cahaya", 1000, 500);
        Monster gelap = new Monster("Gelap", 1000, 500);

        cahaya.attack(gelap);
        gelap.attack(cahaya);

        System.out.println(cahaya.print());
        System.out.println(gelap.print());

        cahaya.attack(cahaya);

    }

}
