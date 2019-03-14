package com.sachinbhagat.Constructor;

public class Account {
    private String accountNumber;
    private double balance;
    private String custemerName;
    private String email;
    private String mobileNumber;


    public void deposite(int depositeAmount) {
        this.balance += depositeAmount;
        System.out.println("You have deposited Rs " + depositeAmount + " Your Current balance is Rs " + this.balance);
    }

    public void withdrawl(int withdrawlAmount) {
        if (this.balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Amount- You cant withdraw " + withdrawlAmount + " You have left Rs " + balance + " in your Account");
        } else {
            balance -= withdrawlAmount;
            System.out.println("You have withdraw " + withdrawlAmount + " Your Current balance is " + balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustemerName(String custemerName) {
        this.custemerName = custemerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public String getCustemerName() {
        this.custemerName = custemerName;
        return custemerName;
    }

    public String getEmail() {
        this.email = email;
        return email;
    }

    public String getMobileNumber() {
        this.mobileNumber = mobileNumber;
        return mobileNumber;
    }

    public double getBalance() {
        this.balance = balance;
        return balance;
    }
}
