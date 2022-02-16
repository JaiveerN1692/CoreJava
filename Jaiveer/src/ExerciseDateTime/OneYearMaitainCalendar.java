package com.ExerciseDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OneYearMaitainCalendar {
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
	
	compr(d, d1);
}
public static void compr(Date d, Date d1) {
	System.out.println("Start Date "+d1);
	System.out.println("End date"+d);
	if(d.before(d1));
	{
		System.out.println("End Date is Greater");
	}
}
}
