package feb12_Methods_Functions_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int input = Math.abs(Integer.parseInt(sc.nextLine()));
		
		System.out.println(getMultiplyEvenByOdds(input));
	}
	
	public static int getMultiplyEvenByOdds (int number) {
		int evenSum = getEvenSum(number);
		int oddSum = getOddSum(number);
		return evenSum * oddSum;
	}
	
	public static int getEvenSum(int number) {
		int total = 0;
		String input = Integer.toString(number);
		int[] array = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (array[i] % 2 == 0) {
				total += array[i];
			}
		}
		return total;
	}
	
	public static int getOddSum(int number) {
		int total = 0;
		String input = Integer.toString(number);
		int[] array = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (array[i] % 2 == 1) {
				total += array[i];
			}
		}
		return total;
	}
}
