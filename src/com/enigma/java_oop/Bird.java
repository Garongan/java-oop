package com.enigma.java_oop;

public class Bird {
    private String color;
    private Integer legs;
    private String sound;
    private String name;

    public Bird(String color, Integer legs, String sound, String name) {
        this.color = color;
        this.legs = legs;
        this.sound = sound;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
