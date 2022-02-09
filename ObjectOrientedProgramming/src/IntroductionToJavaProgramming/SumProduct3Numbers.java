package IntroductionToJavaProgramming;

public class SumProduct3Numbers {

	public static void main(String[] args) {
		int number1 = 98; // Declare an int variable number1 and initialize it to 98
		int number2 = 5;  // Declare an int variable number2 and initialize it to 5
		int number3 = 77; // Declare an int variable number3 and initialize it to 77
		int sum, product;  // Declare 2 int variables to hold results

		// Perform arithmetic Operations
		sum = number1 + number2 + number3;
		product = number1 * number2 + number3;
		
		System.out.printf("%d + %d + %d = %d\n", number1, number2, number3, sum);
		System.out.printf("%d * %d * %d = %d\n", number1, number2, number3, product);
	}

}
