package ExercicesJavaBasics;

import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		final int NUM_STUDENTS = in.nextInt();
		
		int[] grades = new int[NUM_STUDENTS];
		int sum = 0, min = 100, max = 0;
		for (int i=0; i<NUM_STUDENTS;) {
			System.out.printf("Enter the grade for student %d : ", i+1);
			int grade = in.nextInt();
				if (0 <= grade && grade <= 100) {
				grades[i] = grade;
				sum += grade;
				if (grade < min)
					min = grade;
				if (max < grade)
					max = grade;
				++i;
			}
		}
		in.close();
		
		if (NUM_STUDENTS != 0) {
			System.out.printf("The average is : %.2f\n", (double)sum/NUM_STUDENTS);
			System.out.println("The minimum is : " + min);
			System.out.println("The maximum is : " + max);
		}
		else {
			System.out.println("There is no grades");
		}
	}

}
