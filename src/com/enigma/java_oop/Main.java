package com.enigma.java_oop;

import com.enigma.java_oop.Inheritance.Block;
import com.enigma.java_oop.Inheritance.Cow;
import com.enigma.java_oop.Inheritance.Rectangle;

public class Main {
    public static void main(String[] args) {
//        example using inheritance
//        inheritance tidak bisa extends 2 class
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        System.out.println(rectangle.getSurface());
        Block block = new Block(10.0, 5.0, 3.0);
        System.out.println(block.getVolume());
        System.out.println(block.getSurface());

//        example print inheritance class
        System.out.println("===print rectangle===");
        System.out.println(rectangle.print());
        System.out.println("===print block===");
        System.out.println(block.print());

//        example of grandparents
//        inheritance can have many lineages (garis keturunan)
        Cow cow = new Cow();
        cow.makeSound();
        cow.breathe();

//        Object merupakan kelas paling tinggi dalam java
//        setiap kelas dalam merupakan extends dari kelas Object
//        ngoding di java itu satu class satu file
//        setiap class di java memiliki tanggung jawab masing-masing

//        Everything in java is object
        System.out.println(cow.toString());
    }
}
