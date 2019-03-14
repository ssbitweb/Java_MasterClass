package com.sachinbhagat;

public class ReverseNumber {

    // Need to see Again
    public static void main(String[] args) {

        int number = 121;
        int reversed =0;
        int sum = 0;
        while (number !=0) {
            int digit = number % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
        System.out.println("The Reversed Number is "+ reversed);
        System.out.println("The Sum of number is " + sum);
        if(number == reversed){
            System.out.println("The Giver Number is Pallindram");
        }else {
            System.out.println("The Given Number is not Pallindram");
        }
    }
}
