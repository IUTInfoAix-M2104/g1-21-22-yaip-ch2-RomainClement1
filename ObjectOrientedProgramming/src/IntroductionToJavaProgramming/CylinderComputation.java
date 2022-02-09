package IntroductionToJavaProgramming;

public class CylinderComputation {

	public static void main(String[] args) {
		// Declare 5 double variables to hold radius, height, surface area, base area and volume.
		// A "double" holds floating-point number with an optional fractional part.
		double radius, height, surfaceArea, baseArea, volume;
		// Declare a double to hold PI.
		// Declare as "final" to specify that its value cannot be changed (i.e. constant).
		final double PI = 3.14159265;

		// Assign a value to radius and height. (We shall read in the values from the keyboard later.)
		radius = 4;
		height = 2;
		// Compute surface area, base area, volume
		baseArea = PI * radius * radius;
		surfaceArea = 2*baseArea + 2 * PI * radius;
		volume = baseArea * height; 

		// Print results
		System.out.print("The radius is ");  // Print description
		System.out.println(radius);          // Print the value stored in the variable
		System.out.print("The height is ");
		System.out.println(height);
		System.out.print("The base area is ");
		System.out.println(baseArea);
		System.out.print("The surface area is ");
		System.out.println(surfaceArea);
		System.out.print("The volume is ");
		System.out.println(volume);
	}

}
