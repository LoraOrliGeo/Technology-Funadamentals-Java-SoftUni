package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P10_TopNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int upperBound = Integer.parseInt(sc.nextLine());

		for (int i = 0; i <= upperBound; i++) {
			if (divisibleSumOfDigitsBy8(i) && hold1OddDigit(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean divisibleSumOfDigitsBy8(int i) {
		int sum = 0;
		
		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}
		
		if (sum % 8 == 0) {
			return true;
		}
		
		return false;
	}

	public static boolean hold1OddDigit(int i) {
		boolean holds = false;
		
		while (i > 0) {
			int last = i % 10;
			
			if (last % 2 != 0) {
				holds = true;
				break;
			}
			
			i /= 10;
		}
		
		return holds;
	}
}
