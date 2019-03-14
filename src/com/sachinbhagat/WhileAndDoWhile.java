package com.sachinbhagat;

public class WhileAndDoWhile {

    public static void main(String[] args) {
        /*int count =1;
        while (count != 6){
            System.out.println("The count is " + count);
            count++;
        }

        count = 1;
        while (true){
            if(count == 6) {
                break;
            }
            System.out.println("The new count is " + count);
            count++;
        }

        count = 6;
        do{
            System.out.println("The newest count is " + count);
            count++;
            if(count >100){
                break;
            }
        }while (count != 6);*/


        int count = 0;
        int number =4;
        int finishedNumber = 20;
        while (number <= finishedNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("The Even number " + number);
            count++;
            if(count == 5){
                number += number;
                System.out.println("The Sum of all Even Number=" + number);
                break;
            }
        }




    }

    public static boolean isEvenNumber(int n){
        if(n%2 ==0){
            return true;
        }
        return false;
    }
}

