package com.sachinbhagat.ConstructorAccountChallenge;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default name",100,"default@email.com");

    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName,creditLimit,"abc@gmail.com");
    }

    public VipCustomer(String customerName, double creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
