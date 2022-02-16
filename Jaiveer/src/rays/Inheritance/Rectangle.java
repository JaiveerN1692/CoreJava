package com.rays.Inheritance;

public class Rectangle extends Shape{
private int length;
private int width;

public Rectangle() {}
public Rectangle (int a , int b) {
	length = a ;
	width = b ;
}
public int getLength() {
	return length;
}
public int getWidth() {
	return width;
}
public void area() {
int c = length * width;
	System.out.println(c);
}
}

