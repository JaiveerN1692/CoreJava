package basics;

public class Marks {
public static void main(String[] args) {
	int mark=80;
	if(mark>=90) {
		System.out.println("You passed grade :"+ "A"); 
	}
	if(mark>=65) {
		System.out.println("You passed grade :"+ "B");
	}
	if(mark>=45) {
		System.out.println("You passed grade :"+ "C");
	}
	else {
		System.out.println("You Fail");
	}
}
}
