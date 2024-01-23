package com.enigma.java_oop.object_interaction;

public class Room {

//    dependency injection
    private Lamp lamp;

    public Room(Lamp lamp) {
        this.lamp = lamp;
    }

    public void switchLight(){
        if(this.lamp.isOn()) lamp.turnOff();
        else lamp.turnOn();
    }
}
