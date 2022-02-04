package basics;

public class Practise {
public static void main(String[] args)
{
	int i=9;
	String s=String.valueOf(i);
	
	System.out.println(s+8);
	System.out.println(i+9);
	
	long l=10;
	int a=(int)l;
	System.out.println(l);
	
	int x=25;
	int y=56;
	int result=(x>y ? x:y);
	System.out.println(result);
	
	
	int d=Integer.parseInt(args[0]);
	int e=Integer.parseInt(args[1]);
	int sum=d+e;
	System.out.println("sum  of"+ "="+ sum);
	
	
	
	int [][]table=new int[5][5];
	table[0][0]=10;
	table[0][1]=10;
	table[0][2]=10;
	table[0][3]=10;
	table[0][4]=10;
	table[1][0]=20;
	table[1][1]=20;
	table[1][2]=20;
	table[1][3]=20;
	table[1][4]=20;
	
	for(int row=0;row<table.length;row++) {
		System.out.println(" ");
		for(int col=1;col<=table[row].length;col++) {
			int z=(row+1)*col;
			System.out.print(z+"\t");
			
		}
		System.out.println();
	}
	
	
	
	
	
	

}
}
