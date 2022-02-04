package basics;

public class TestArms {
public static void main(String[] args) {
	int a=370;
	int b=a;
	int c, sum=0;

	while(a>0) {
		c = a % 10;
		System.out.println(c);
		a = a/10;
		sum = sum + c*c*c;
		
	}
	if(b==sum) {
		System.out.println("Its an Armstrong no.");
	}else
	{
		System.out.println("Its not an Armstrong no.");
	}
		
		
}
}
