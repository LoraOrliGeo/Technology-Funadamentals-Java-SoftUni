package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P01_ValidUsernames {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(", ");
		
		for (String word : input) {
			if (validation(word)) {
				System.out.println(word);
			}
		}
	}
	
	public static boolean validation(String word) {
		if (word.length() < 3 && word.length() > 16) {
			return false;
		}
		
		for (int i = 0; i < word.length(); i++) {
			if (!Character.isLetterOrDigit(word.charAt(i)) && word.charAt(i) != '-' && word.charAt(i) != '_') {
				return false;
			}
		}
		return true;
	}
}
