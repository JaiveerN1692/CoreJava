package basics;

public class TestPrime {
public static void main(String[] args) {
	int no = 5;
	int a = 0;
	for (int i = 2; i >=no; i++) {
		if(no%i==0) {
			a = a + 1;
		}
	}
	if(a > 0) {
		System.out.println("no. is not prime");
	}else {
		System.out.println("no. is prime");
	}
}
}
