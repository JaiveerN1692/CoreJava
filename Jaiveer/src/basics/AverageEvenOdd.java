package basics;

public class AverageEvenOdd {
public static void main(String[] args) {
	int e = 0; int n =10;
	int o = 0;
	
		for (int j =0; j < n; j++) {
			
			if(j%2==0) {
				j++;
				e=e+j;
				System.out.println(j);
			}else {
				j++;
				o=o+j;
				System.out.println("odd"+j);
			}
	

}
}
}