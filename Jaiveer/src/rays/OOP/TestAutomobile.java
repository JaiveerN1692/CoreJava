package com.rays.OOP;

public class TestAutomobile {
public static void main(String[] args) {
	
	AutoMobile a = new AutoMobile();
	a.setColor("Black");
	System.out.println(a.getColor());
	
	a.setMake("BMW");
	System.out.println(a.getMake());
	
	a.setSpeed(80);
	System.out.println(a.getSpeed());
	
	a.gear(5);
	System.out.println(a.getSpeed());
	
	AutoMobile s = new AutoMobile("Black","BMW",50);

	System.out.println(s.getColor());
	System.out.println(s.getMake());
	System.out.println(s.getSpeed());

}
}
