package com.sachinbhagat.Constructor;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setCustemerName("Sachin Shatrughna Bhagat");
        acc.setAccountNumber("123456789");
        acc.setEmail("sachinbhagat0307@gmail.com");
        acc.setMobileNumber("9527426453");
        acc.setBalance(24109);

        System.out.println("Customer Name is " + acc.getCustemerName());
        System.out.println("Your Account Number is " + acc.getAccountNumber());
        System.out.println("Email Id is " + acc.getEmail());
        System.out.println("Your Mobile No - "+ acc.getMobileNumber());
        System.out.println("Your Current balance is Rs " + acc.getBalance());

        acc.deposite(25000);
        acc.withdrawl(12513);

    }
}
