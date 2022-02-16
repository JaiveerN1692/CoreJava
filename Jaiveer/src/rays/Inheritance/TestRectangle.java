package com.rays.Inheritance;

public class TestRectangle {
public static void main(String[] args) {
	
	Rectangle r = new Rectangle(20,30);
	
	r.setBorderwidth(100);
	System.out.println(r.getBorderwidth());
	
	r.setColor("Black");
	System.out.println(r.getColor());
	
	r.area();
}
}
