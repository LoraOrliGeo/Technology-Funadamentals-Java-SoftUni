package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		printGrade(Double.parseDouble(sc.nextLine()));
	}
	
	public static void printGrade(double grade) {
		if (2 <= grade && grade <= 2.99) {
			System.out.println("Fail");
		} else if (3 <= grade && grade <= 3.49) {
			System.out.println("Poor");
		} else if (3.50 <= grade && grade <= 4.49) {
			System.out.println("Good");
		} else if (4.50 <= grade && grade <= 5.49) {
			System.out.println("Very good");
		} else if (5.50 <= grade && grade <= 6) {
			System.out.println("Excellent");
		} 
	}
}
