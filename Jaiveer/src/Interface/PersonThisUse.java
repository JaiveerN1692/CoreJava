package com.Interface;

public class PersonThisUse {
protected String fname = null;
protected String lname = null;
protected String address = null;

public PersonThisUse() {
	System.out.println("Person Default");
}
	
public PersonThisUse(String fname , String lname) {
	this();
	System.out.println("Person 2 parameter");
}

public PersonThisUse(String fname , String lname , String address) {
	this(fname,lname);
	System.out.println("Person 3 parameter");
}
public static void main(String[] args) {
	PersonThisUse p = new PersonThisUse("ggv","fcchg","hjhchbg");
	System.out.println();
}
}

