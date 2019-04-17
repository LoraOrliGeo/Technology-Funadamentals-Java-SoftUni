package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;

public class P4_TextFilter {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] bannedWords = sc.nextLine().split(", ");
		String text = sc.nextLine();
		
		for (String word : bannedWords) {
			if (text.contains(word)) {
				String replacement = "";
				for (int i = 0; i < word.length(); i++) {
					replacement += "*";
				}
				text = text.replaceAll(word, replacement);
			}
		}

		System.out.println(text);
	}
}
