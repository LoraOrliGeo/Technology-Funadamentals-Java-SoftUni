package ex2_TextProcessingAndRegEx_MoreEx;

import java.util.Scanner;

public class P2_AsciiSumator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		int one = sc.nextLine().charAt(0);
		int two = sc.nextLine().charAt(0);

		String line = sc.nextLine();

		int sum = 0;

		for (int i = 0; i < line.length(); i++) {
			char temp = line.charAt(i);

			if (one < two) {
				if (temp > one && temp < two) {
					sum += temp;
				}
			} else {
				if (temp > two && temp < one) {
					sum += temp;
				}
			}
		}

		System.out.println(sum);
	}
}
