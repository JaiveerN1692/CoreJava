package com.ExerciseDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MaintenanceCalendar {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String s = sdf.format(d);
	System.out.println(s);
	
	String s1 = "15/02/2022";
	Date d1 = sdf.parse(s1);
	
	String s2 = "01/06/1992";
	Date d2 = sdf.parse(s2);
	Calendar c= Calendar.getInstance();
	
	Caldr(c);
}

public static void Caldr(Calendar c) {
	for(int i=0;i<10;i++) {
		c.add(Calendar.DATE,30);
		Date n=c.getTime();
		System.out.println(n);
	}
}
}
