package ExercicesJavaBasics;

public class Contains {
	
	public static boolean contains(int[] array, int key) {
		for (int value : array)
			if (value == key)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		
		int[] tests = {1, 3, 5};
		for (int test : tests)
			System.out.printf("%d is %sin the array\n", test, contains(array, test) ? "" : "not ");
	}

}
