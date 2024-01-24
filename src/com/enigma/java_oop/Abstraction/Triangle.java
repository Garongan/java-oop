package com.enigma.java_oop.Abstraction;

public class Triangle extends Shape{
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double getCircumference() {
        return null;
    }

    @Override
    public Double getSurface() {
        return 0.5 * base * height;
    }
}
