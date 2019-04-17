package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;

public class P5_DigitsLettersAndOther {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String digits = "";
		String letters = "";
		String others = "";
		
		for (int i = 0; i < input.length(); i++) {
			char symbol = input.charAt(i);
			
			if (Character.isDigit(symbol)) {
				digits += symbol;
			} else if (Character.isLetter(symbol)) {
				letters += symbol;
			} else {
				others += symbol;
			}
		}
		
		System.out.println(digits);
		System.out.println(letters);
		System.out.println(others);
	}
}
