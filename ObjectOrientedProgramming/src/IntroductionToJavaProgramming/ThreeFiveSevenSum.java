package IntroductionToJavaProgramming;

public class ThreeFiveSevenSum {
	
	public static void main(String[] args) {
	      final int LOWERBOUND = 1;
	      final int UPPERBOUND = 1000;
	      int sum = 0;
	      for (int i=LOWERBOUND; i<=UPPERBOUND; ++i)
				if ((i%3==0 || i%5==0 || i%7==0) && (i%15!=0 && i%21!=0 && i%35!=0 && i%105!=0))
					sum += i;
	      // Print the result
	      System.out.println("The sum is " + sum);
	}

}
