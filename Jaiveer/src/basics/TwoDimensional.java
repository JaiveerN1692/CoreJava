package basics;

public class TwoDimensional {
	public static void main(String[] args) {
		int[][] tables= new int [10][10];
		/*
		 * tables[0][0] =2; tables[1][0] =4; tables[2][0] =1; tables[3][0] =9;
		 * tables[4][0] =6; tables[5][0] =9; tables[6][0] =8; tables[0][1] =8;
		 * tables[1][1] =8; tables[2][1] =8; tables[3][1] =8; tables[4][1] =8;
		 * tables[5][1] =8; tables[6][1] =8;
		 */
		
		
		
   for(int row=0;row<tables.length;row++) {
	   System.out.println(" ");
	   for(int col=2;col<=tables[row].length;col++) {
		   int c=(row+1)*col;
		   System.out.print(c+"\t");
	   }
	   System.out.println();
   }
		
		
	}


}
