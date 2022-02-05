package basics;

public class ArrayAsParameter {
public static void main(String[] args) {
	int []a = {2,4,9,7,4,10};
	
	int c=0;
	
	int b = a[0];
	
	for (int i : a) {
		
	if(i>b) {
	
		b = i;
		
	}
}	
	System.out.println("greater value is -: " + b);
}
}