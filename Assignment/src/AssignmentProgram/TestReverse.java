package AssignmentProgram;

public class TestReverse {
public static void main(String[] args) {
String s1="Jaiveer Nahta";
System.out.println(s1);
	String[] s=s1.split(" ");
	for(String k:s) {
		System.out.println(k);
	}
	for(String k:s) {
		for (int i =k.length(); i>=1; i--) {
			System.out.print(k.charAt(i-1));
		}
	}
}
}
