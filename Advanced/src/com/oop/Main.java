package com.oop;
public class Main {

    

    public static void main(String[] args) {
        
        int time = 0;
        int limit = 3;

        // Player object
        Player player1 = new Player("Dave",100);
        Player player2 = new Player("Danny", 100);

        // Weapon object
        Weapon sword = new Weapon("Great Sword", 35);
        Weapon dagger = new Weapon("Falcon Dagger", 30);

        // Armor object
        Armor clothes = new Armor("Clothes",40);
        Armor ompa = new Armor("Ompaa lompaa Custome", 10);


        player1.equipWeapon(sword);
        player1.equipArmor(clothes);
      
        System.out.println();

        player2.equipWeapon(dagger);
        player2.equipArmor(ompa);

        // Start Game 
        while(time < limit ){
            player1.attackOpponent(player2);
            player2.attackOpponent(player1); 
             
            if(player1.health <= 0 ) {
                System.out.println(player2.name + " Win !!!");
             break;
            } 
            System.out.println(player1.name + " Win !!!");
            
            time++;  
        }
        
            
    
        
      

 

    }
} 