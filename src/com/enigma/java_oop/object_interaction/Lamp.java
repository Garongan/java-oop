package com.enigma.java_oop.object_interaction;

public class Lamp {
    private Boolean isOn = false;
    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
    }

    public Boolean isOn() {
        return isOn;
    }
}
