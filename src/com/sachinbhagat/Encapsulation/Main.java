package com.sachinbhagat.Encapsulation;

public class Main {

    public static void main(String[] args) {
/*
        Player player = new Player();
        player.name = "Sachin";
        player.health = 20;
        player.weapon = "Sward";

        int damage = 15;
        player.looseHealth(damage);
        System.out.println("Remaining Health is now "+ player.healthRemaining());

        damage = 5;
        player.looseHealth(damage);
        System.out.println("Remaining Health is now "+ player.healthRemaining());
*/
        EnhancedPlayer player = new EnhancedPlayer("Sachin", 50, "Sward");
        System.out.println("Initial health is "+ player.getHealth());

    }
}
