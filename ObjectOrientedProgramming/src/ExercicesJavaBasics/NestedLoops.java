package ExercicesJavaBasics;

import java.util.Scanner;

public class NestedLoops {

	public static void SquarePattern() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter square size : ");
		int size = in.nextInt();
		in.close();
		for (int i=0; i<size; ++i) {
			for (int j=0; j<size; ++j)
				System.out.print("# ");
			System.out.println();
		}
	}
	
	public static void TimeTable() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = in.nextInt();
		in.close();
		
		// Print 2 firsts lines
		System.out.print(" * |");
		for (int i=1; i<=size; ++i)
			System.out.printf("%4d", i);
		System.out.println("\n" + "-".repeat(4*(size+1)));
		
		// Print table
		for (int i=1; i<=size; ++i) {
			System.out.printf("%2d |", i);
			for (int j=1; j<=size; ++j)
				System.out.printf("%4d", i*j);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		SquarePattern();
		TimeTable();
	}
	
}
