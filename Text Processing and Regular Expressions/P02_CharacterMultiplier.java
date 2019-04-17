package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P02_CharacterMultiplier {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		String first = text.substring(0, text.indexOf(' '));
		String second = text.substring(text.indexOf(' ') + 1);
		
		int res = multiplyChars(first, second);
		System.out.println(res);
	}
	
	public static int multiplyChars(String first, String second) {
		int minLength = Math.min(first.length(), second.length());
		int sum = 0;
		
		for (int i = 0; i < minLength; i++) {
			sum += first.charAt(i) * second.charAt(i);
		}
		
		String maxLength = first.length() < second.length() ? second : first;
		
		for (int i = minLength; i < maxLength.length(); i++) {
			sum += maxLength.charAt(i);
		}
		return sum;
	}
}
