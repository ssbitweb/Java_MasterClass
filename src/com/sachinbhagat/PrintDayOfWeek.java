package com.sachinbhagat;

public class PrintDayOfWeek {

    public static void main(String[] args) {
        printDayOfTheWeek(10);
    }

    public static void printDayOfTheWeek(int dayNumber){

        switch (dayNumber){
            case 0:
                System.out.println("This is Sunday");
                break;
            case 1:
                System.out.println("this is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("this is Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
