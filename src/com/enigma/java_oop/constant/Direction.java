package com.enigma.java_oop.constant;

public enum Direction {
    NORTH, // 0
    EAST, // 1
    SOUTH, // 2
    WEST; // 3

    public Direction turnRight() {
        return values()[(this.ordinal() + 1 > values().length ? 0 : this.ordinal() + 1)];
    }

    public Direction turnLeft() {
        return values()[(this.ordinal() - 1 < 0 ? values().length - 1 : this.ordinal() - 1)];
    }
}
