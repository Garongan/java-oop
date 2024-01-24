package com.enigma.java_oop.Abstraction;


/*
* 1. Interface only create abstract method
* 2. Interface is contract
* 3. Interface use implements keyword to declare the child
* 4. Multiple inheritance
* 5. Interface can't instantiate
* 6. Interface class can't declare the attribute, constructor. it only can't declare special method
* */
public interface Vehicle {
//    secara default access modifier di interface is public

//    when java 8 and hinger bisa melakukan deklarasi atribut, namun atribut tersebut konstan
//    String name = "Ferrari";
    void run();
    void stop();
}
