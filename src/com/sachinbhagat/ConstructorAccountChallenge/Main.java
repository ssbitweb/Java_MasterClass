package com.sachinbhagat.ConstructorAccountChallenge;

public class Main {

    public static void main(String[] args) {
	Account acc = new Account("123456789",24109,"Sachin Shatrughna Bhagat", "sachinbhagat0307@gmail.com","952##26453");
		//System.out.println(" The Customer Detail : \n Account Number: \t"+ acc.getAccountNumber() + "\n Available Balance: \t"+ acc.getBalance()+"\n Customer Name: \t"+ acc.getCustemerName()+"\n Email: \t"+ acc.getEmail()+ "\n Mobile Number: \t"+ acc.getMobileNumber() );
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getBalance());
		System.out.println(acc.getCustemerName());
		System.out.println(acc.getEmail());
		System.out.println(acc.getMobileNumber());

	acc.deposite(25000);
	acc.withdrawl(10000);
	acc.withdrawl(4000);
	VipCustomer vc1 = new VipCustomer();
		System.out.println(vc1.getCustomerName());
		System.out.println(vc1.getCreditLimit());
		System.out.println(vc1.getEmail());

	VipCustomer vc2 = new VipCustomer("Pallavi Lungare",25000);
		System.out.println(vc2.getCustomerName());
		System.out.println(vc2.getCreditLimit());
		System.out.println(vc2.getEmail());

	VipCustomer vc3 = new VipCustomer("sachin Bhagat",25000,"sachinbht37@gmail.com");
		System.out.println(vc3.getCustomerName());
		System.out.println(vc3.getCreditLimit());
		System.out.println(vc3.getEmail());
    }
}
