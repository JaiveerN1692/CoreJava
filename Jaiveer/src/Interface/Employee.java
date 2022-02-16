package com.Interface;

public class Employee extends PersonThisUse{

	private String designation = null;
	
	public Employee () {
		System.out.println("Default Constructor");
	}
	
	public Employee(String fn, String ln) {
		System.out.println("2 parameter Employee");
	}
	
	public Employee(String fn, String ln, String dest) {
		super(fn,ln);
		System.out.println("3 Parameter Employee");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("ggg","vhgg");
		System.out.println();
	}
}
