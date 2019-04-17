package ex2_TextProcessingAndRegEx_MoreEx;

import java.util.Scanner;

public class P4_MorseCodeTranslator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		char[] english = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		
		String[] input = sc.nextLine().split(" \\| ");
		
		String output = "";
		
		for (int i = 0; i < input.length; i++) {
			String[] letters = input[i].split(" ");
			String word = "";
			for (int j = 0; j < letters.length; j++) {
				for (int k = 0; k < morse.length; k++) {
					if (letters[j].equals(morse[k])) {
						word += english[k];
						break;
					}
				}
			}
			output += word + " ";
		}
		
		System.out.println(output);
		
	}
}
