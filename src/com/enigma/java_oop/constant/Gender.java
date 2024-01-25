package com.enigma.java_oop.constant;

public enum Gender {
    MALE("ini laki-laki"),
    FEMALE("ini perempuan");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static String tes(){
        return "testing static";
    }
}
