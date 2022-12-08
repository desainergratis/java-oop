package com.oop;
public class Player {
    String name;
    double health;
    Weapon weapon;
    Armor armor;

    // constructor
    Player(String inputName, double inputHealth) {
        this.name = inputName;
        this.health = inputHealth;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    void equipArmor(Armor armor) {
        this.armor = armor;
    }

     double getHealth() {
        return this.health = this.health + this.armor.defence;
    }
    
    void attackOpponent(Player opponent) {
        opponent.health = opponent.health - this.weapon.attack;
        System.out.println(opponent.name + " gots damage : "+ this.weapon.attack + "\n");
        opponent.showDetail();
    }

    void showDetail() {
        System.out.println("Player name : "+this.name + "\n" +
        "Health : "+this.getHealth() + "%");
        this.weapon.display();
    }
}