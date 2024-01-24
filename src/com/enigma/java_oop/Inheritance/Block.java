package com.enigma.java_oop.Inheritance;

public class Block extends Rectangle {
    private Double height;
    public Block(Double length, Double width, Double height) {
//        super merupakan sebuah fungsi khusus dalam pewarisan untuk mengakses constructor, method ataupun attribute
//        super() -> mengakses constructor
//        super.length -> mengakses property parent
//        super.getSurface() -> mengakses method parent
        super(length, width);
        this.height = height;
    }

    public Double getVolume() {
        return super.getSurface() * height;
    }

    @Override // <- anotasi: penanda/metadata
//    Override -> menuliskan ulang fungsi dari parent
    public Double getSurface() {
        return 2 * (super.getSurface() + (super.length * height) + (super.width * height)); // 2 * (p*l + p*h + w*h)
    }

    @Override
    public Double getCircumference() {
        return 2 * super.getCircumference() + 4 * height; // 2 * (p+l) + 4 * h atau bisa juga 4 * (p+l+t)
    }

    public String print(){
        return "length: " + super.length + "m\n" +
                "width: " + super.width + "m\n" +
                "surface: " + getSurface() + "m2\n" +
                "circumference: " + getCircumference() + "m\n" +
                "volume: " + getVolume() + "m3\n";
    }
}