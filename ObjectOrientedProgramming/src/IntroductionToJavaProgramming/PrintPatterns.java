package IntroductionToJavaProgramming;

public class PrintPatterns {
	public static void PrintCheckerPattern() {
		System.out.println("* * * * * ");
		System.out.println(" * * * * *");
		System.out.println("* * * * * ");
		System.out.println(" * * * * *");
		System.out.println("* * * * * ");		
	}
	
	public static void PrintSquarePattern() {
		System.out.println("* * * * *");
		System.out.println("*       *");
		System.out.println("*       *");
		System.out.println("*       *");
		System.out.println("* * * * *");		
	}
	
	public static void PrintTriangularPattern() {		
		System.out.println("* * * * *");
		System.out.println(" *     * ");
		System.out.println("  *   *  ");
		System.out.println("   * *   ");
		System.out.println("    *    ");
	}
	
	public static void PrintStarPattern() {
		System.out.println("    *    ");
		System.out.println("* *   * *");
		System.out.println("   * *   ");
		System.out.println("  *   *  ");
		System.out.println(" *     * ");		
	}
	
	public static void PrintSheepPattern() {		
		System.out.println("          '__'");
		System.out.println("          (oo)");
		System.out.println("  /========// ");
		System.out.println(" / || @@ ||   ");
		System.out.println("*  ||----||   ");
		System.out.println("   VV    VV   ");
		System.out.println("   ''    ''   ");
	}
	
	public static void main(String[] args) {
		PrintCheckerPattern();
		System.out.println();
		PrintSquarePattern();
		System.out.println();
		PrintTriangularPattern();
		System.out.println();
		PrintStarPattern();
		System.out.println();
		PrintSheepPattern();
	}
}
