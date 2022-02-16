package com.rays.Inheritance;



public class Circle extends Shape {
private int radius;

public Circle() {}
public Circle (int i) {
	radius = i;
}

public int getRadius() {
	return radius;
}
public void area() {
	System.out.println(Math.PI*radius*radius);
	
	
}
}
