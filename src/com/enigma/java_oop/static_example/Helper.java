package com.enigma.java_oop.static_example;

import java.util.Scanner;

public class Helper {
    public static String inputString(String info) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("%s : ", info);
            String input = scanner.nextLine();
            if (input.isBlank() || input.isEmpty()) {
                continue;
            }
            return input;
        }
    }
    public static String inputString(String info, boolean isNumber) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("%s : ", info);
            String input = scanner.nextLine();
            if ((input.isBlank() || input.isEmpty()) && isNumber) {
                continue;
            }
            return input;
        }
    }
}
