package IntroductionToJavaProgramming;

public class Loop {
	
	public static void RunningNumberSum() {
		final int START = 9;
		final int END = 899;
		int i = START, sum = 0;
		
		while (i <= END) {
			sum += i;
			++i;
		}
		
		System.out.println("Number sum from " + START + " to " + END + " is " + sum);
	}
	
	public static void RunningNumberOddSum() {
		final int START = 1;
		final int END = 1000;
		int i = START, sum = 0;
		
		while (i <= END) {
			sum += i;
			i += 2;
		}
		
		System.out.println("Number odd sum from " + START + " to " + END + " is " + sum);
	}
	
	public static void RunningNumberMod7Sum() {
		final int START = 1;
		final int END = 1000;
		int i = START+(7-START%7), sum = 0;
		
		while (i <= END) {
			sum += i;
			i += 7;
		}
		
		System.out.println("Number mod 7 sum from " + START + " to " + END + " is " + sum);
	}
	
	public static void RunningNumberSquareSum() {
		final int START = 1;
		final int END = 100;
		int i = START, sum = 0;
		
		while (i <= END) {
			sum += i * i;
			++i;
		}
		
		System.out.println("Number Square sum from " + START + " to " + END + " is " + sum);
	}
	
	public static void RunningNumberProduct() {
		final int START = 1;
		final int END = 10;
		int i = START, product = 1;
		
		while (i <= END) {
			product *= i;
			++i;
		}
		
		System.out.println("Number product from " + START + " to " + END + " is " + product);
	}
	
	public static void main(String[] args) {
		RunningNumberSum();
		RunningNumberOddSum();
		RunningNumberMod7Sum();
		RunningNumberSquareSum();
		RunningNumberProduct();
	}

}
