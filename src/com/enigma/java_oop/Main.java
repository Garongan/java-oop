package com.enigma.java_oop;

import com.enigma.java_oop.constant.Direction;
import com.enigma.java_oop.constant.Gender;
import com.enigma.java_oop.static_example.Constant;
import com.enigma.java_oop.static_example.Helper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Gender male = Gender.MALE;
//        System.out.println(male);
//        System.out.println(Gender.MALE);
//        System.out.println(Gender.FEMALE);
//
//        System.out.println(Arrays.toString(Gender.values()));
//
////        how to call the enum class
//        System.out.println(Gender.MALE.getDescription());
//        System.out.println(Gender.tes());

        Direction north = Direction.valueOf("NORTH");
        System.out.println(north.turnRight());
//        System.out.println(north.turnLeft());
    }

}
