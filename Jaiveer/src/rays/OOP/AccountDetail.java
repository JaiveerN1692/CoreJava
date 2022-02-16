package com.rays.OOP;

public class AccountDetail {
	private String accountNumber;
	private String accountType;
	private Double balance= 00.0;

	public AccountDetail() {}
	public AccountDetail(String s,String y,double d) {
		this.accountNumber=s;
		this.accountType= y;
		this.balance=d;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public void deposit(double i) {
		double d=getBalance();
		      d+=i;
		      setBalance(d);
	}
	
	public void withdraw(double i) {
		double d=getBalance();
	      d-=i;
	      setBalance(d);
	}
	public void fundTransfer(double i) {
	     double d=getBalance();
	     d-=i;
	     setBalance(d);
	}
	
}
