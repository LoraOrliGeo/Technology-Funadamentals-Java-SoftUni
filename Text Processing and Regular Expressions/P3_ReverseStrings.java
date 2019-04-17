package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;

public class P3_ReverseStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String word = "";
		while (!"end".equals(word = sc.nextLine())) {
			String reversed = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversed += word.charAt(i);
			}
			System.out.println(String.format("%s = %s", word, reversed));
		}
	}
}
