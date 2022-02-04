package AssignmentProgram;

public class Marks {
public static void main(String[] args) {
	int marks=100;
	if(marks >= 90) {
		System.out.println("You got A++ Grade");
	}
	else if(marks>=75) {
		System.out.println("You got A Grade");
	}
	else if(marks>=65) {
		System.out.println("You got B++ Grade");
	}
	else if(marks>=60) {
		System.out.println("You got B Grade");
	}
	else if(marks>=50) {
		System.out.println("You got C Grade");
	}
	else if(marks>=40) {
		System.out.println("You got D Grade");
	}
	else {
		System.out.println("Oppppps!!!!! You are Fail in Exam");
	}
}
}
