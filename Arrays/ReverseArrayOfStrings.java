package feb5_Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split(" ");

		for (int i = 0; i < split.length / 2; i++) {
			String temp = split[i];
			split[i] = split[split.length - i - 1];
			split[split.length - i - 1] = temp;
		}

		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i] + " ");
		}
	}
}
