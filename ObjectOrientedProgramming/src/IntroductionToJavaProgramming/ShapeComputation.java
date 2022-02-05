package IntroductionToJavaProgramming;

public class ShapeComputation {
	
	public static final double PI = 3.14159265359;
	
	public static void RectangleComputation() {
		double length = 5, width = 3;
		double perimeter = 2 * (length + width);
		double area = length * width;
		
		System.out.println("Rectangle data :");
		System.out.println("Length    -> " + length);
		System.out.println("Width     -> " + width);
		System.out.println("Perimeter -> " + perimeter);
		System.out.println("Area      -> " + area);
	}
	
	public static void CylinderComputation() {
		double radius = 3, height = 10;
		double baseArea = PI * radius * radius;
		double surfaceArea = 2 * baseArea + 2 * PI * radius * height;
		double volume = baseArea * height;
		
		System.out.println("Cylinder data :");
		System.out.println("Radius       -> " + radius);
		System.out.println("Height       -> " + height);
		System.out.println("Base area    -> " + baseArea);
		System.out.println("Surface area -> " + surfaceArea);
		System.out.println("Volume       -> " + volume);
	}
	
	public static void main(String[] args) {
		RectangleComputation();
		System.out.println();
		CylinderComputation();
	}
	
}
