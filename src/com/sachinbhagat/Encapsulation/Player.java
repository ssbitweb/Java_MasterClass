package com.sachinbhagat.Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player is Knocked out");
        }
    }
    public int healthRemaining(){
        return health;
    }
}
