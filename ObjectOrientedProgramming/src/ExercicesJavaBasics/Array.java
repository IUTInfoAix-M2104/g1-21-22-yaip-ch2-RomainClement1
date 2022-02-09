package ExercicesJavaBasics;

import java.util.Scanner;

public class Array {
	
	public static void PrintArray() {
		// Data gathering
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of items : ");
		final int NUM_ITEMS = in.nextInt();
		System.out.print("Enter the value of all items (separated by space) : ");
		int[] items = new int[NUM_ITEMS];
		for (int i=0; i<NUM_ITEMS; ++i)
			items[i] = in.nextInt();
		in.close();
		
		// Data display
		System.out.print("The values are : [" + (items.length==0 ? "]" : items[0]));
		if (items.length != 0) {
			for (int i=1; i<items.length; ++i)
				System.out.print(", " + items[i]);
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) {
		PrintArray();
	}

}
