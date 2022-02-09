package ExercicesJavaBasics;

import java.util.Scanner;

public class isOddEvenTest {

	public static boolean isOdd(int number) {
		return number%2 == 1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		in.close();
		System.out.printf("%d is an %s number", n, isOdd(n) ? "odd" : "even");
	}
	
}
