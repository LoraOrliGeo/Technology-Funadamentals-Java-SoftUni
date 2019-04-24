package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_WithouthMethods {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		int number = Math.abs(Integer.parseInt(sc.nextLine()));
		
		int evenSum = 0;
		int oddSum = 0;
		
		while (number > 0) {
			int lastDigit = number % 10;
			if (lastDigit % 2 == 0) {
				evenSum += lastDigit;
			} else {
				oddSum += lastDigit;
			}
			number /= 10;
		}
		
		System.out.println(evenSum * oddSum);
	}
}
