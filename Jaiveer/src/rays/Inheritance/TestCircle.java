package com.rays.Inheritance;

public class TestCircle {
public static void main(String[] args) {
	
	Circle c = new Circle(5);
	
	c.setBorderwidth(10);
	System.out.println(c.getBorderwidth());
	
	c.setColor("black");
	System.out.println(c.getColor());
	
	c.area();
	
}
}
