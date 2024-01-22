package com.enigma.java_oop.Inheritance;

/*
* Core concepts Inheritance
* 1. Superclass (Parent Class) -> Kelas yang akan mewariskan method atau attribute
* 2. Subclass (Child Class) -> Kelas yang mewarisi method atau attribute dari parent
* 3. Override -> Subclass dapat merubah implementasi dari method atau attribute yang diwariskan
* 4. extends -> keyword dalam java untuk mewariskan kelas
*
*
* satu parent dapat memiki banyak child
* child tidak boleh memiliki parent lebih dari satu
*
* */

public class Rectangle {

    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

//    kita dapat membuat constructor kosong, namun harus assign arguments memakai setter dan getter

    public Double getSurface(){
        return length * width;
    }

    public Double getCircumference(){
        return 2 * (length + width);
    }

    public String print(){
        return "length: " + length + "m\n" +
                "width: " + width + "m\n" +
                "surface: " + getSurface() + "m2\n" +
                "circumference: " + getCircumference() + "m\n";
    }
}
