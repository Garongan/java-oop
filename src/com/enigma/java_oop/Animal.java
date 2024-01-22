package com.enigma.java_oop;

public class Animal {
    private String name;
    private String color;
    private String sound;
    private Integer legs;

    public Animal(String name, String color, String sound, Integer legs) {
        this.name = name;
        this.color = color;
        this.sound = sound;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }
}
