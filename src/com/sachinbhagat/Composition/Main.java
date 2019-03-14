package com.sachinbhagat.Composition;

public class Main {

    public static void main(String[] args) {
        Dimentions dimentions = new Dimentions(20,20,5);
        Case theCase = new Case("220B","dell","240", dimentions);
        Monitor theMonitor = new Monitor("27 inch beast","Acer", 27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();
    }
}
