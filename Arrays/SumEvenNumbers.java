package feb5_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] split = input.split(" ");
		int[] number = new int[split.length];
		
		int sum =0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				sum += number[i];
			}
		}
		System.out.println(sum);
		
		//another way:
		
		int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		
		int sum1 = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum1 += numbers[i];
			}
		}
		
		System.out.println(sum1);
	}
}
