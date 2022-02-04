package basics;

public class Array {
public static void main(String[] args) {
	int[] table;
	table = new int[5];
	table[0]=3;
	table[1]=5;
	table[2]=8;
	table[3]=2;
	table[4]=10;
	int ele = table[4];
	System.out.println("5th element" +ele);
	int size=table.length;
	System.out.println("Size is : "+size);

}
}

