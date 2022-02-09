package IntroductionToJavaProgramming;

public class PrintLeapYears {

	public static void main(String[] args) {
		final int LOWERBOUND = 999;
		final int UPPERBOUND = 2010;
		int counter = 0;
		for (int i=LOWERBOUND; i<=UPPERBOUND; ++i)
			if (i%4 == 0) {
				System.out.println(i);
				++counter;
			}
		// Print the result
		System.out.printf("There is %d leap years beteen %d and %d", counter, LOWERBOUND, UPPERBOUND);
	}

	

}
