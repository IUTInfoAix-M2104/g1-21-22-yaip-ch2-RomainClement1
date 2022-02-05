package IntroductionToJavaProgramming;

public class Decision {
	
	public static void ThreeFiveSevenSum() {
		int sum = 0;
		
		for (int i = 1; i <= 1000; ++i)
			if ((i%3==0 || i%5==0 || i%7==0) && (i%15!=0 && i%21!=0 && i%35!=0 && i%105!=0))
				sum += i;

		System.out.println(sum);
	}
	
	public static void PrintLeapYears() {
		int counter = 0;
		
		for (int i=999; i<=2010; ++i)
			if (i%4 == 0) {
				System.out.println(i);
				++counter;
			}
		
		System.out.println("Total : " + counter);
	}
	
	public static void main(String[] args) {
		ThreeFiveSevenSum();
		PrintLeapYears();
	}

}
