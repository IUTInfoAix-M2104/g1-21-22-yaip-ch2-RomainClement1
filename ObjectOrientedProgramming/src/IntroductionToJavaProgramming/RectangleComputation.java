package IntroductionToJavaProgramming;

public class RectangleComputation {

	public static void main(String[] args) {
		// Declare 4 double variables to hold length, width, area and perimeter.
		// A "double" holds floating-point number with an optional fractional part.
		double length, width, area, perimeter;

		// Assign a value to length and width. (We shall read in the values from the keyboard later.)
		length = 4;
		width = 3;
		// Compute area and perimeter
		area = length * width;
		perimeter = (length + width) * 2; 

		// Print results
		System.out.print("The length is ");  // Print description
		System.out.println(length);          // Print the value stored in the variable
		System.out.print("The width is ");
		System.out.println(width);
		System.out.print("The area is ");
		System.out.println(area);
		System.out.print("The perimeter is ");
		System.out.println(perimeter);
	}

}
