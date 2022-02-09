package ExercicesJavaBasics;

import java.util.Scanner;

public class StringAndCharOperations {

	public static void ReverseString() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		in.close();

		System.out.print("Reversed is : ");
		for (int i=str.length()-1; i>=0; --i)
			System.out.print(str.charAt(i));
		System.out.println();
	}

	public static void CheckBinStr() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a binary string : ");
		String str = in.next();
		in.close();
		boolean isValid = true;
		for (int i=0; i<str.length(); ++i)
			if (str.charAt(i) != '0' && str.charAt(i) != '1') {
				isValid = false;
				break;
			}
		System.out.println("\""
						 + str
						 + "\" is "
						 + (isValid ? "" : "NOT ")
						 + "a binary string");
	}
	
	public static void CheckHexStr() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a hex string : ");
		String str = in.next();
		in.close();
		boolean isValid = true;
		for (int i=0; i<str.length(); ++i) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9')
			 && !('a' <= c && c <= 'f')
			 && !('A' <= c && c <= 'F')) {
				isValid = false;
				break;
			}
		}
		System.out.println("\""
						 + str
						 + "\" is "
						 + (isValid ? "" : "NOT ")
						 + "a hex string");
	}

	public static void main(String[] args) {
//		ReverseString();
//		CheckBinStr();
		CheckHexStr();
	}

}
