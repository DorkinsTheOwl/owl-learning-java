package com.owlcode;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tom";
//        player.health = 20;
//        player.weapon = "Lightsaber";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tom", 50, "Wand");
        System.out.println("Initial health is " + player.getHealth());
    }
}
