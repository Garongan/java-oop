package com.enigma.java_oop.object_interaction;

public class Hero implements HitAble{
    private String name;
    private Integer hp;
    private Integer damage;

    public Hero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getDamage() {
        return damage;
    }

    // use interface method
    public void attack(HitAble character) {
        if (character.equals(this)) System.out.println("tidak bisa menyerang diri sendiri");
        else character.receiveDamage(this.damage);
    }

    // bisa diganti default access modifier agar di main tidak dipakai
    @Override
    public void receiveDamage(Integer damage) {
        if (this.hp - damage <= 0) System.out.println(this.name + " sudah mati");
        else this.hp -= damage;
    }

    public String print() {
        return "Heroes: " + name +
                " Health Point: " + hp +
                " Attack: " + damage;
    }
}
