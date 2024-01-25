package com.enigma.java_oop;

import com.enigma.java_oop.static_example.Constant;
import com.enigma.java_oop.static_example.Helper;

public class Main {
    public static void main(String[] args) {

//        using static variable
        System.out.println(Constant.APPLICATION);

//        using static method
        String inputName = Helper.inputString("Masukkan nama");
        String inputAge = Helper.inputString("Masukkan usia", true);
        System.out.printf(Constant.SUCCESS_MESSAGE, inputName + "\n");
        System.out.printf(Constant.SUCCESS_MESSAGE, inputAge + "\n");
        System.out.println(inputName);
        System.out.println(inputAge);
    }

}
