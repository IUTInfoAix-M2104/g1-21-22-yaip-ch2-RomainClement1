package ExercicesJavaBasics;

import java.util.Scanner;

public class Exponent {
	
	public static int exponent(int base, int exp) {
		int product = 1;
		for (int i=0; i<exp; ++i)
			product *= base;
		return product;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base = in.nextInt();
		System.out.print("Enter the exponent : ");
		int exp = in.nextInt();
		in.close();
		
		System.out.printf("%d raises to power of %d is : %d", base, exp, exponent(base, exp));
	}
	
}
