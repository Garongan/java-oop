package com.enigma.java_oop.object_interaction;

public class Monster {
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
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

    // monster attack hero
    public void attack(Hero hero) {
        hero.receiveDamage(this.damage);
    }

    // use overloading
    public void attack(Monster monster) {
        if (monster.equals(this)) System.out.println("tidak bisa menyerang diri sendiri");
        else monster.hp -= this.damage;
    }

    // bisa diganti default access modifier agar di main tidak dipakai
    void receiveDamage(Integer damage) {
        if (this.hp - damage == 0) System.out.println(this.name + " sudah mati");
        this.hp -= damage;
    }

    public String print() {
        return "Monster: " + name +
                " Health Point: " + hp +
                " Attack: " + damage;
    }
}
