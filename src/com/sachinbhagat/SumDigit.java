package com.sachinbhagat;

public class SumDigit {

    public static void main(String[] args) {
        System.out.println("the sum of digit  is " + sumDigit(125));
        System.out.println("the sum of digit  is " + sumDigit(12465));
        System.out.println("the sum of digit  is " + sumDigit(25));
        System.out.println("the sum of digit  is " + sumDigit(1));
        System.out.println("the sum of digit  is " + sumDigit(4));
    }

    public static int sumDigit(int number){
        if(number <10){
            return -1;
        }
        int sum = 0;
        // 125 = 125/10 =12 -> 12*10 = 120 -> 125-120 = 5
        while (number >0){
            //extract least -significant digit
            int digitNumber = number % 10;
            sum += digitNumber;
            //drop the least significant digit
            number /= 10;  //number = number/10;
        }
        return sum;
    }
}
