package com.enigma.java_oop;

import com.enigma.java_oop.Inheritance.Animal;
import com.enigma.java_oop.Inheritance.Cow;
import com.enigma.java_oop.Inheritance.Mammals;
import com.enigma.java_oop.Polymorphism.Developer;
import com.enigma.java_oop.Polymorphism.Employee;
import com.enigma.java_oop.Polymorphism.Manager;

public class Main {
//    public static void main(String[] args) {
//        Employee employee = new Employee("Alvindo");
//        employee.sayHello("Budi");
//
//        employee = new Manager("Rahman");
//        employee.sayHello("Alvindo");
//
//        employee = new Developer("Irfan");
//        employee.sayHello("Rahman");
//
//    }

    public static void main(String[] args) {
//        Polymorphism
//        Parent obj = new Child()
//        Parent obj2 = new Parent
        Animal animal = new Mammals();
        animal.setName("Kuda");
//        tidak bisa memanggil instance dari parent
//        Mammals mammals = new Animal(); -> the right way is using casting

//        casting animal to (mammals)
        Mammals mammals = (Mammals) animal;
        mammals.setName("sapi");

//        masih memakai attibute parent karena di casting
        System.out.println(animal.getName());
        System.out.println(mammals.getName());

//        TipeData variableName = new Instance();
        Animal animal1 = new Cow();
        Cow cow = (Cow) animal1;

//        the different calling mathod
        animal.breathe();
        animal.move();

//        the mammals can get the animal method
        mammals.breathe();
        mammals.getBirth();
        mammals.move();

//        the cow can get the mammals method and animal method
        cow.makeSound();
        cow.breathe();
        cow.move();
        cow.getBirth();


        Animal dino = new Animal();
        dino.setName("Indominus Rex");
        Mammals horse = new Mammals();
        horse.setName("Australian Horse");
        Cow cow1 = new Cow();
        cow1.setName("Japan Cow");
        Animal[] animals = new Animal[3];
        animals[0] = dino;
        animals[1] = horse;
        animals[2] = cow1;

        for (Animal animalObject : animals){
            System.out.println(animalObject.getName());
        }

    }
}
