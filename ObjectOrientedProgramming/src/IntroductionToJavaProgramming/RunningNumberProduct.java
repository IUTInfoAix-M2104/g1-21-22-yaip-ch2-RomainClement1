package IntroductionToJavaProgramming;

public class RunningNumberProduct {

	public static void main(String[] args) {
		final int LOWERBOUND = 1;      // Store the lowerbound
		final int UPPERBOUND = 10;   // Store the upperbound
		int product = 1;   // Declare an int variable "product" to accumulate the numbers
		// Set the initial product to 1
		// Use a while-loop to repeatedly sum from the lowerbound to the upperbound
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			// number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
			product *= number;  // Accumulate number into product
			++number;            // increment number
		}
		// Print the result
		System.out.println("The product from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
	}
	
}
