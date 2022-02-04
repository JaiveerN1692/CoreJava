package basics;
import java.text.SimpleDateFormat;
import java.util.*;
public class date {
public static void main(String[] args) {

Date d=new Date();
System.out.println("Date :"+ d);
System.out.println(d.getTime());

SimpleDateFormat A=new SimpleDateFormat("dd/MM/yyyy");
String s=A.format(d);
System.out.println(s); 



}
}
