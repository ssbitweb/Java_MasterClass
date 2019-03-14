package com.sachinbhagat.Classes;

public class Main {

    public static void main(String[] args) {
        Car tata = new Car();
        Car mahindra = new Car();
        tata.setModel("nano");
        mahindra.setModel("xuv");


        System.out.println("model is " + tata.getModel());
    }
}
