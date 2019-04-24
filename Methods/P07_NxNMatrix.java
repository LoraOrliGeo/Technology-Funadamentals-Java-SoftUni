package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P07_NxNMatrix {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		
		getMatrix(number);
	}
	
	static void getMatrix (int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}
}
