package com.enigma.java_oop.Abstraction;

// access modifier abstract dan non-abstract class nameClass
// tujuan kita memakai abstract adalah untuk menyembunyikan detail dari implementasi dan menampilkan hanya fitur di dalam project

/*
* 1. Abstract class can have common method or attribute
* 2. Abstract class can have method, but the method must implements in child class
* 2. Abstract class can have the constructor, that must declare when inherit to child class
*
* */

public abstract class Shape {

    public abstract Double getCircumference();
    public abstract Double getSurface();
}
