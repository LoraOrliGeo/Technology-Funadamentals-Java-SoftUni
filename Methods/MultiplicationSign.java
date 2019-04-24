package feb13_Methods_Functions_MoreExercises;

import java.util.Scanner;

public class MultiplicationSign {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());

		if (num1 == 0 || num2 == 0 || num3 == 0) {
			System.out.println("zero");
		} else {
			if (num1 < 0) {
				if(num2 < 0) {
					if(num3 < 0) {
						System.out.println("negative");
					} else {
						System.out.println("positive");
					}
				} else {
					if(num3 < 0) {
						System.out.println("positive");
					} else {
						System.out.println("negative");
					}
				}
			}

		}
	}
}
