package com.rays.OOP;

public class TestAccount {
public static void main(String[] args) {
	AccountDetail a = new AccountDetail();
	a.setAccountNumber("123456789");
	System.out.println(a.getAccountNumber());
	
	a.setAccountType("Savings Account");
	System.out.println(a.getAccountType());
	
	a.setBalance(100.00);
	System.out.println(a.getBalance());
	
	a.deposit(5000);
	System.out.println(a.getBalance());
	
	a.withdraw(5000);
	System.out.println(a.getBalance());
	
	a.fundTransfer(300);
	System.out.println(a.getBalance());

AccountDetail s = new AccountDetail("123shyam","current",5000);

System.out.println(s.getAccountNumber());
System.out.println(s.getAccountType());
System.out.println(s.getBalance());

s.deposit(5000);
s.withdraw(2000);
System.out.println(s.getBalance());
}
}
