package com.sachinbhagat;

public class Operators {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 =" +result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 =" +result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 =" +result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 =" +result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now = " + result);

        result++;
        System.out.println("result is now = " + result);

        result--;
        System.out.println("result is now = " + result);

        result += 2;
        System.out.println("result is now = " + result);

        result *=10;
        System.out.println("result is now = " + result);

        result -=10;
        System.out.println("result is now = " + result);

        result /=10;
        System.out.println("result is now = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Its not a alien Surely");

        //if ( topscore != 100)
        //if ( topscore >= 100)
        //if ( topscore <= 100)
        int topscore = 80;
        if ( topscore < 100)
            System.out.println("you have got top Score");

        int secondTopScore = 81;
        if ((topscore > secondTopScore) && (topscore <100))

            System.out.println("topscore is greater that secondTopScore and less than 100 ");

        if ((topscore > 90) || (topscore <100))
            System.out.println(" one of condition is true");

        int newValue = 50;
        if (newValue == 50)

            System.out.println("this ia true");

        boolean isCar = false;
        if(isCar = true)
            System.out.println("this is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true: false;
        if(wasCar)
            System.out.println("wasCar is true");




    }
}
