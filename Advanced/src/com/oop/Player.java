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
    
    void attackOpponent(Player opponent) {
       System.out.println(this.name + " attacking " + opponent.name + "\n");
       defence(opponent);
       
    }

    void defence(Player opponent) {
        
        if(this.weapon.attack < opponent.armor.defence) {
            opponent.health = opponent.health - (this.weapon.attack * 0.35);
            System.out.println(opponent.name + " get's damage "+ (this.weapon.attack * 0.35) + " from " + this.name);
            showDetail(opponent);
        } else {
            opponent.health = opponent.health - this.weapon.attack;
            showDetail(opponent);
            System.out.println(opponent.name + " get's damage "+ this.weapon.attack + " from " + this.name);
    }
    }

    void showDetail(Player opponent) {
        System.out.println("Player name : "+ opponent.name + "\n" +
        "Health : "+opponent.health + "%" + "\n");
    }
}