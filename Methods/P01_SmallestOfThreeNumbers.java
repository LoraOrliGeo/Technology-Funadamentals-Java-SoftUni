package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		
		int minElement = getSmallestNumber(num1, num2);
		System.out.println(getSmallestNumber(minElement, num3));
	}
	
	public static int getSmallestNumber (int num1, int num2) {
		return Math.min(num1, num2);
	}
}
