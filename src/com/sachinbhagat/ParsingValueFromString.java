package com.sachinbhagat;

public class ParsingValueFromString {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString is "+ numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number is "+ number);

        numberAsString += 1;
        number += 1;

        System.out.println("Number as String is" + numberAsString);
        System.out.println("Number is " + number);
    }
}
