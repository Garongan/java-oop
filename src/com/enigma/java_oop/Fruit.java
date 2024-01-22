package com.enigma.java_oop;

public class Fruit {
    private String color;
    private String name;
    private Integer seed;

    public Fruit(String color, String name, Integer seed) {
        this.color = color;
        this.name = name;
        this.seed = seed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }
}
