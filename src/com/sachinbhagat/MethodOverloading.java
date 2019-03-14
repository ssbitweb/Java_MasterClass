package com.sachinbhagat;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore(" Sachin", 500);
        System.out.println("New Score of method with two parameter is " + newScore);

        calculateScore(300);
        calculateScore();
        double centimeters = calFeetAndInchesToCentimeter(6,13);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameter ");
        }
        calFeetAndInchesToCentimeter(100);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " Scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("unnamed player Score  "+ score);
        return score;
    }

    public static void calculateScore(){

        System.out.println("no parameter");
    }

    public static double calFeetAndInchesToCentimeter(double feet, double inches){
        if((feet <0)||(inches <=0 || inches >12 )){
            System.out.println("invalid entry ");
            return  -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches *2.54;
        System.out.println(feet + "feet" + inches + "inches =" + centimeters + " cm");
        return centimeters;
    }


    public static double calFeetAndInchesToCentimeter(double inches){
        if(inches <0){
            return -1;
        }
        double feet =  (int) inches/ 12;
        double remainingInches =  (int) inches % 12;
        System.out.println( inches + " inches is equal to " + feet + "feet and" + remainingInches + "inches");
        return calFeetAndInchesToCentimeter(feet,remainingInches);
    }
}
