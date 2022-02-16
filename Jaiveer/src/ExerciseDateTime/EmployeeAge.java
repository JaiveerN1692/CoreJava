package com.ExerciseDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EmployeeAge {
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
	
	calDat(d,d2);
	
}
public static void calDat(Date d1, Date d2) {
Calendar c = Calendar.getInstance();
c.setTime(d1);
int year = c.get(Calendar.YEAR);
int month = c.get(Calendar.MONTH);
int date = c.get(Calendar.DATE);

c.setTime(d2);
int year1 = c.get(Calendar.YEAR);
int month1 = c.get(Calendar.MONTH);
int date1 = c.get(Calendar.DATE);

System.out.println("Age :-"+(year-year1)+"Year"+(month-month1)+"Month-"+(date-date1)+"Day");
}
}
