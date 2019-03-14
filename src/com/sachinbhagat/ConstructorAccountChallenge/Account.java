package com.sachinbhagat.ConstructorAccountChallenge;

public class Account {
    private String accountNumber;
    private double balance;
    private String custemerName;
    private String email;
    private String mobileNumber;

    public Account(){
        this("123456789",24109, "default name","default email","default mobile number");
        System.out.println("The empty account constructor is called");
    }

    public Account(String accountNumber, double balance, String custemerName, String email, String mobileNumber){
        System.out.println("Account Constructor with parameter called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.custemerName = custemerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public void deposite(double depositeAmount){
        this.balance +=depositeAmount;
        System.out.println("You have deposited Rs " + depositeAmount + " Your Current balance is Rs " + this.balance);
    }

    public void withdrawl(double withdrawlAmount){
        if(this.balance - withdrawlAmount <0){
            System.out.println("You can't withdraw "+ withdrawlAmount+ " as only Rs" +this.balance + " is available in your account" );
        }else {
            this.balance -= withdrawlAmount;
            System.out.println("You have withdraw "+ withdrawlAmount + " Your Current balance is Rs"+ this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustemerName() {
        return custemerName;
    }

    public void setCustemerName(String custemerName) {
        this.custemerName = custemerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
