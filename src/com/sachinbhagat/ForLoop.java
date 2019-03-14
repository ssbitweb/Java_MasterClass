package com.sachinbhagat;

public class ForLoop {

    public static void main(String[] args) {
       /* for(int i =0; i<5; i++){
            System.out.println(i);
        }*/
       /* for(int i = 2; i <= 9 ; i++ ){
            System.out.println("The interest of 5000.00 at "+ i + " % are "+String.format("%.2f",calculateInterest(10000.0,i)));

        }

        System.out.println("*****************");
        for(int i = 9; i >= 2 ; i-- ){
            System.out.println("The interest of 5000.00 at "+ i + " % are "+String.format("%.2f",calculateInterest(10000.0,i)));
        }*/
       int count = 0;
       for(int i =10; i<50; i++){
           if(isPrime(i)){
               count++;
               System.out.println("Number "+ i + " is prime");
               if(count == 10){
                   System.out.println("exit the loop");
                   break;
               }
           }
       }
    }
/*
    public static double calculateInterest(double amount,double interestRate ){
            return (amount*(interestRate/100));

    }*/

    public static boolean isPrime(int n) {


        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }


        }
        return true;

    }

}

