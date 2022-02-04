package basics;

public class Divi {
public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c;
	for(int i=100 ; i<200 ; i++)
	{
		if(i % 7 == 0) {
			a = a + i;
			b++;
			System.out.println(i);
		}		
	}
	c = a/b;
	System.out.println("Sum of all divisible no. by 7 -:" +a);
	System.out.println("Average of all divisible no. by 7 -:" + c);
}
}
