package AssignmentProgram;

public class CharacterCount {

	public static void main(String[] args) {
	
	String name = "Jaiveer Kumar nahta ";
	int s = 0;
	int r = 0;
	int t = 0;
	char c = 'a';
	char d = 'e';
	char e = 'r';
	
	for (int i=0; i<name.length(); i++) {
		
		if( c == name.charAt(i)) {
			
			s++;
			
		}	
		
		if( d== name.charAt(i)) {
			r++;
		}
		
		if(e==name.charAt(i)) {
			t++;
		}
	}
	System.out.println("for char A ="+s);
	System.out.println("for char E ="+r);
	System.out.println("for char R ="+t);
}
}
