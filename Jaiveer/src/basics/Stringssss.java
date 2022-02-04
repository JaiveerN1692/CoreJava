package basics;

import java.util.jar.Attributes.Name;

public class Stringssss {
public static void main(String[] args) {
	String person="Jaiveer Nahta";
	System.out.println("String Length -"+ person.length());
	System.out.println("7th Character is -"+person.charAt(5));
	System.out.println("Nahta index of -"+ person.indexOf("Nahta"));
	System.out.println("First v position-"+ person.indexOf("v"));
	System.out.println("Last h position is- "+ person.lastIndexOf("h"));
	System.out.println("a is replace by h- "+ person.replace("a","h"));
	System.out.println("all e replace by n- "+person.replaceAll("e","n"));
	System.out.println("chhota Nahta- "+person.toLowerCase());
	System.out.println("bada Nahta- "+person.toUpperCase());
	System.out.println("Substring-"+person.substring(2));
}
}
