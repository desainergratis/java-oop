package com.oop;
public class Weapon {
    String name;
    double attack;

    Weapon(String inputName, double inputAttack) {
        this.name = inputName;
        this.attack = inputAttack;
    }

    void display() {
        System.out.println("Weapon : "+this.name + "\n" 
        + "Attack : "+this.attack);
    }
}