package ExercicesJavaBasics;

public class FactorialGraphicDebugger {
	
	public static void main(String[] args) {
		int n = 20;
		long factor = 1;
		for (int i=2; i<=n; ++i)
			factor *= i;
		System.out.println("Result is " + factor);
	}
	
}
