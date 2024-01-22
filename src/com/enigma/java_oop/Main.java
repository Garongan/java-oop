package com.enigma.java_oop;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ayla", "blue", 4, "ASOK123");

//        before using encapsulation
//        when using the direct access we can't add logic to validation or manipulate the data
//        car.fuel = 30;

//        after using encapsulation
        car.fillFuel(10);
        car.fillFuel(20);

        Car mobilio = new Car();

        System.out.println(car.getFuel());
        System.out.println(car.print());

        /*
         * Access Modifier
         *
         * there is 4 access modifier
         * 1. default -> if not initialize access modifier
         * 2. private -> only can access by attribute or method inside calls
         * 3. public -> can access by other class and inside class
         * 4. protected -> only can access by same class or inherited class
         *
         * */

        /*
         * Getter and Setter
         * Get -> to get the value
         * Set -> to set the value
         * */

        System.out.println("======Abstract and Object Example=======");

//        abstract and object example
        Bird emprit = new Bird("Hijau", 2, "citt", "Emprit");
        Fruit apel = new Fruit("Merah", "Apel", 5);
        Animal kera = new Animal("Kera", "Coklat", "uuuAAA", 2);

        System.out.println(emprit.getName() + " suaranya " + emprit.getSound());
        System.out.println(apel.getName() + " warnanya " + apel.getColor());
        System.out.println(kera.getName() + " suaranya " + kera.getSound());
    }
}
