package IntroductionToJavaProgramming;

public class IntegerSum {
	
	public static void SixIntegerSum() {
		int n1= 11;
		int n2 = 22;
		int n3 = 33;
		int n4 = 44;
		int n5 = 55;
		int n6 = 66;
		
		int sum = n1 + n2 + n3 + n4 + n5 + n6;
		System.out.println("The sum of six integers is " + sum);
	}
	
	public static void SevenIntegerSum() {
		int n1= 11;
		int n2 = 22;
		int n3 = 33;
		int n4 = 44;
		int n5 = 55;
		int n6 = 66;
		int n7 = 77;
		
		int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7;
		System.out.println("The sum of seven integers is " + sum);
	}
	
	public static void FiveIntegerProduct() {
		int n1= 11;
		int n2 = 22;
		int n3 = 33;
		int n4 = 44;
		int n5 = 55;
		
		int product = n1 * n2 * n3 * n4 * n5;
		System.out.println("The product of five integers is " + product);
	}
	
	public static void main(String[] args) {
		SixIntegerSum();
		SevenIntegerSum();
		FiveIntegerProduct();
	}
	
}
