package com.enigma.java_oop;

import com.enigma.java_oop.object_interaction.Hero;
import com.enigma.java_oop.object_interaction.Lamp;
import com.enigma.java_oop.object_interaction.Monster;
import com.enigma.java_oop.object_interaction.Room;

public class Main {
    public static void main(String[] args) {
        Hero gatokaca = new Hero("Gatotkaca", 1000, 80);
        Hero satima = new Hero("Saitama", 1000, 100);

        Monster serpent = new Monster("Serpent", 500, 50);
        Monster sugra = new Monster("Sugra", 500, 100);

//        Object interaction
        System.out.println("Sebelum attack");
        System.out.println(gatokaca.print());
        System.out.println(satima.print());
        System.out.println(serpent.print());
        System.out.println(sugra.print());

//        bedakan mana objek satima dan objek gatotkaca
//        monster attack monster
//        hero attack hero
        satima.attack(gatokaca);
        gatokaca.attack(satima);
        serpent.attack(sugra);
        sugra.attack(serpent);


        System.out.println("Setelah attack");
        System.out.println(gatokaca.print());
        System.out.println(satima.print());
        System.out.println(serpent.print());
        System.out.println(sugra.print());

//        lagi war
        System.out.println();
        System.out.println("===========lagi war===========");

        Hero nana = new Hero("Nana", 100, 500);
        Monster balmond = new Monster("Balmond", 1000, 50);
        System.out.println(nana.print());
        System.out.println(balmond.print());

        System.out.println("\n===nana attack===");
        nana.attack(balmond);
        System.out.println(balmond.print());

        System.out.println("\n===nana self attack===");
        nana.attack(nana);

        System.out.println("\n===balmond attack===");
        balmond.attack(nana);
        System.out.println(nana.print());

        System.out.println("\n===balmond self attack===");
        balmond.attack(balmond);

//        dependency injection example
//        class sebagai type data

        Lamp lamp = new Lamp();
        Room room = new Room(lamp);
        room.switchLight();

        System.out.println(lamp.isOn());
    }
}
