package AssignmentProgram;

public class TestReverseTwo {
public static void main(String[] args) {
	String name="Jaiveer Nahta";
	

	String s2= "";

	for (int i = 0; i < s1.length; i++) {
		String s=s1[i];
		System.out.println(s);
		String revs="";
		
	for (int j = s.length() -1; j>=0; j--) {
		revs=revs + s.charAt(j);
	}
	s2 = s2 + revs + "";	
		
	}
	System.out.println(s2);
}
}
