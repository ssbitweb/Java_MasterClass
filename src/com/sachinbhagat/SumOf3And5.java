package com.sachinbhagat;

public class SumOf3And5 {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i<=1000; i++){
            if(divisibleBy3And5(i)){
                System.out.println("The Numbers are "+ i +"");
                count++;
                sum += i;
                if(count == 5){
                    System.out.println("The sum of all 5 Numbers are "+ sum);
                    break;

                }
            }
        }
    }
    public static boolean divisibleBy3And5(int n){
        if((n % 3 == 0) && (n % 5 ==0)){
            return true;
        }
        return false;
    }

}
