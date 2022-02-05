package ExercicesJavaBasics;

public class DecisionAndLoop {

	public static final int START = 1;
	public static final int END = 100;

	public static void SumAverageRunningInt() {
		int sum = 0;
		for (int i=START; i<=END; ++i)
			sum += i;
		System.out.println("Sum from " + START + " to " + END + " is " + sum);
		System.out.println("Average is " + (double) sum / (double) (END - START + 1));
	}

	public static void SumAverageRunningIntWhile() {
		int i = START, sum = 0;
		while (i <= END) {
			sum += i;
			++i;
		}
		System.out.println("Sum from " + START + " to " + END + " is " + sum);
		System.out.println("Average is " + (double) sum / (double) (END - START + 1));
	}

	public static void SumAverageRunningIntDoWhile() {
		int i = START, sum = 0;
		do {
			sum += i;
			++i;
		} while (i <= END);
		System.out.println("Sum from " + START + " to " + END + " is " + sum);
		System.out.println("Average is " + (double) sum / (double) (END - START + 1));
	}

	public static void SumAverageRunningNumberSquare() {
		long sum = 0;
		for (int i=START; i<=END; ++i)
			sum += i * i;
		System.out.println("Number Square sum from " + START + " to " + END + " is " + sum);
	}

	public static void SumRunningIntOddEven() {
		int sumOdd = 0, sumEven = 0;

		for (int i=START; i<=END; ++i) {
			if (i%2 == 1)
				sumOdd += i;
			else
				sumEven += i;
		}

		int absDiff = sumOdd>sumEven ? sumOdd-sumEven : sumEven-sumOdd;

		System.out.println(sumOdd);
		System.out.println(sumEven);
		System.out.println(absDiff);
	}

	public static void Factorial() {
		int product = 1;
		for (int i=2; i<=10; ++i)
			product *= i;
		System.out.println(product);
	}

	public static void HarmonicSum() {
		int n = 100;

		double sumL2R = 0;
		for (int i=1; i<=n; ++i)
			sumL2R += 1.0/i;
		System.out.println(sumL2R);

		double sumR2L = 0;
		for (int i=n; i>=1; --i)
			sumR2L += 1.0/i;
		System.out.println(sumR2L);

		double absDiff = sumL2R>sumR2L ? sumL2R-sumR2L : sumR2L-sumL2R;
		System.out.println(absDiff);
	}

	public static void ComputePi() {
		final long MAX_TERM = 10000000;
		double pi = 0;

		// This solution is better because there is no condition in loop
		// Note: we go 2 times deeper because we iterate 2 times from 1 to MAX_TERM
		for (long i=0; i<=MAX_TERM; ++i)
			pi += 1.0/(4*i+1);
		for (long i=0; i<=MAX_TERM; ++i)
			pi -= 1.0/(4*i+3);
		pi *= 4;
		System.out.println(pi);
		System.out.println(pi/Math.PI*100 + "% precision");
	}

	public static void CozaLozaWoza() {
		for (int i=0; i<11; ++i) {
			for (int j=0; j<11; ++j) {
				int n = 11*i + j + 1;
				if (n%3==0 || n%5==0 ||n%7==0) {
					if (n%3 == 0)
						System.out.print("Coza");
					if (n%5 == 0)
						System.out.print("Loza");
					if (n%7 == 0)
						System.out.print("Woza");
				} else {
					System.out.print(n);
				}
				System.out.print('\t');
			}
			System.out.println();
		}
	}

	public static void Fibonacci() {
		int n = 20;
		int first = 1, second = 1;
		int sum = first + second;
		System.out.print(first + " " + second + " ");
		for (int i=2; i<n; ++i) {
			int nextValue = first + second;
			System.out.print(nextValue + " ");
			first = second;
			second = nextValue;
			sum += nextValue;
		}
		System.out.println("\nAverage is " + sum/(float)n);
	}
	
	public static void Tribonacci() {
		int n = 20;
		int first = 1, second = 1, third = 2;
		int sum = first + second + third;
		System.out.print(first + " " + second + " " + third + " ");
		for (int i=3; i<n; ++i) {
			int nextValue = first + second + third;
			System.out.print(nextValue + " ");
			first = second;
			second = third;
			third = nextValue;
			sum += nextValue;
		}
		System.out.println("\nAverage is " + sum/(float)n);
	}
	
	
	public static void main(String[] args) {
		SumAverageRunningInt();
		SumAverageRunningIntWhile();
		SumAverageRunningIntDoWhile();
		SumAverageRunningNumberSquare();
		SumRunningIntOddEven();
		Factorial();
		HarmonicSum();
		ComputePi();
		CozaLozaWoza();
		Fibonacci();
		Tribonacci();
	}

}
