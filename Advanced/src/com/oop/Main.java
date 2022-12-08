package com.oop;
public class Main {

    public static void main(String[] args) {
        
        // Player object
        Player player1 = new Player("Dave",100);
        Player player2 = new Player("Danny", 100);

        // Weapon object
        Weapon sword = new Weapon("Great Sword", 35);
        Weapon dagger = new Weapon("Falcon Dagger", 30);

        // Armor object
        Armor clothes = new Armor("Clothes",40);
        Armor ompa = new Armor("Ompaa lompaa Custome", 25);


        player1.equipWeapon(sword);
        player1.equipArmor(clothes);
      
        

        System.out.println();

        player2.equipWeapon(dagger);
        player2.equipArmor(ompa);
      

        // Start war
        for(int index=0; index < 3; index++){
            player1.attackOpponent(player2);
            player2.attackOpponent(player1);
            System.out.println();
            if(player1.health < player2.health) {
                System.out.println(player2.name + " Win !!! \n" + "Health: "+ player2.health);
            } else {
                System.out.println(player1.name + " Win !!! \n" + "Health: "+ player1.health);
            }
        }

    }
} 