package com.sachinbhagat;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date Of Birth:");

        int dateOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        int age = (2018 - dateOfBirth);
        System.out.println("Your Name is "+ name + " and You are "+ age + " Years of old.!!");

        scanner.close();
    }
}
