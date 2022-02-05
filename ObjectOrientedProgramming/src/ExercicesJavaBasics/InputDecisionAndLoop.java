package ExercicesJavaBasics;

import java.util.Scanner;

public class InputDecisionAndLoop {

	public static void Add2Integers() {
		int n1, n2;
		Scanner in = new Scanner(System.in);
		System.out.print("n1 = ");
		n1 = in.nextInt();
		System.out.print("n2 = ");
		n2 = in.nextInt();
		in.close();
		System.out.println("n1 + n2 = " + (n1 + n2));
	}
	
	public static void SumProductMinMax3() {
		int n1, n2, n3;
		Scanner in = new Scanner(System.in);
		System.out.print("n1 = ");
		n1 = in.nextInt();
		System.out.print("n2 = ");
		n2 = in.nextInt();
		System.out.print("n3 = ");
		n3 = in.nextInt();
		in.close();
		System.out.println("n1 + n2 + n3 = " + (n1 + n2 + n3));
		System.out.println("n1 * n2 * n3 = " + (n1 * n2 * n3));
		System.out.println("Min : " + Math.min(Math.min(n1, n2), n3));
		System.out.println("Max : " + Math.max(Math.max(n1, n2), n3));
	}
	
	public static void CircleComputation() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius circle : ");
		double radius = in.nextDouble();		
		in.close();
		System.out.println("Diameter : " + 2*radius);
		System.out.println("Circumference : " + 2*Math.PI*radius);
		System.out.println("Area : " + Math.PI*radius*radius);
	}
	
	public static void SphereComputation() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sphere radius : ");
		double radius = in.nextDouble();
		in.close();
		System.out.println("Surface : " + 4*Math.PI*radius*radius);
		System.out.println("Volume : " + 4/3*Math.PI*radius*radius*radius);
	}
	
	public static void CylinderComputation() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter cylinder radius : ");
		double radius = in.nextDouble();
		System.out.print("Enter cylinder height : ");
		double height = in.nextDouble();
		in.close();
		System.out.println("Base area : " + Math.PI*radius*radius);
		System.out.println("Surface : " + (2*Math.PI*radius*radius+2*Math.PI*radius*height));
		System.out.println("Volume : " + Math.PI*radius*radius*height);
	}
	
	public static void Swap2Integers() {
		Scanner in = new Scanner(System.in);
		System.out.print("n1 = ");
		int n1 = in.nextInt();
		System.out.print("n2 = ");
		int n2 = in.nextInt();
		in.close();
		System.out.println("Value before swap : " + n1 + " | " + n2);
		int temp = n2;
		n2 = n1;
		n1 = temp;
		System.out.println("Value after swap : " + n1 + " | " + n2);
	}
	
	public static void main(String[] args) {
		Add2Integers();
		SumProductMinMax3();
		CircleComputation();
		SphereComputation();
		CylinderComputation();
		Swap2Integers();
	}

}
