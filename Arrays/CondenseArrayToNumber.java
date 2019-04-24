package feb5_Arrays_Lab;

import java.util.Scanner;

public class CondenseArrayToNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] input1 = input.split(" ");
		int[] originalArray = new int[input1.length];
		for (int i = 0; i < input1.length; i++) {
			originalArray[i] = Integer.parseInt(input1[i]);
		}
		
		while (originalArray.length > 1) {
			int[] condensedArray = new int[originalArray.length - 1];
			for (int i = 0; i < condensedArray.length; i++) {
				condensedArray[i] = originalArray[i] + originalArray[i + 1];
			}
			originalArray = condensedArray;
		}
		System.out.println(originalArray[0]);
	}
}
