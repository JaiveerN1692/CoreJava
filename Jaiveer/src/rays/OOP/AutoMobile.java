package com.rays.OOP;

public class AutoMobile {
	
private String color = null;
private String make = null;
private int speed = 0;

public AutoMobile() {}
public AutoMobile(String s,String y,int d) {
	this.color=s;
	this.make= y;
	this.speed=d;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}

public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

public void gear(int i) {
	int d = getSpeed();
      d-=i;
      setSpeed(d);
}
}
