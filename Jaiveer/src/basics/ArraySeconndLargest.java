package basics;

import java.util.Arrays;

public class ArraySeconndLargest {
public static void main(String[] args) {
/*	int [] a = {2,9,8,4,6,3,7};
	
	int z =a.length;
	
	Arrays.sort(a);

	System.out.println("Second largest value is -: "+a[z-2]);
*/
	
int []a = {2,4,9,7,4,10};
	
	int c=0;
	
	int b = a[0];
	
	for (int i : a) {
		
	if(i>b) {
		c=b;
		b = i;
		
	}else if(i>c) 
	{
		c=i;
	}

}	
	
	System.out.println("greater value is -: " + b);
}
}
