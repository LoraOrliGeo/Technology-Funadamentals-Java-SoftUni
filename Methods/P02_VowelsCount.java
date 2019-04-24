package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P02_VowelsCount {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (isVowel(input.charAt(i))) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	public static boolean isVowel(char symbol) {
		// "aeoiuy"
		switch (symbol) {
		case 'a':
		case 'e':
		case 'o':
		case 'i':
		case 'u':
		case 'y':
			return true;
		}
		return false;
	}
}
