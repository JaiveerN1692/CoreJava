package com.rays.Polymorphism;

public class Overloading {
public  void add(int a , int b) {
	System.out.println(a + b);
}
public void add(int a , int b , int c) {
	System.out.println(a + b + c);
}
public void add(double a , int b) {
	System.out.println(a + b);
}
public double add (double a , int b ,int c) {
	return a+b+c;
}
}
