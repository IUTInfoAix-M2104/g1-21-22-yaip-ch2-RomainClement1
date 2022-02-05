package IntroductionToJavaProgramming;

public class ArithmeticOperations {
	
	public static void SumProduct3Numbers() {
		int n1 = 98, n2 = 5, n3 = 77;
		
		System.out.println(n1 + n2 + n3);
		System.out.println(n1 * n2 * n3);
	}

	public static void main(String[] args) {
		int number1 = 98, number2 = 5;
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		int quotient = number1 / number2;
		int remainder = number1 % number2;

		// 1)
		System.out.println("The sum, difference, product, quotient and remainder of "
				+ number1
				+ " and "
				+ number2
				+ " are "
				+ sum
				+ ", "
				+ difference
				+ ", "
				+ product
				+ ", "
				+ quotient
				+ ", and "
				+ remainder);

		// 2)
		System.out.println(31 * number1 + 17 * number2);
		
		// 3)
		SumProduct3Numbers();
		
	}

}
