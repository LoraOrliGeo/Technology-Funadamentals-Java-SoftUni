package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P06_MiddleCharacters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		getMiddleCharacter(input);
	}
	
	public static void getMiddleCharacter (String input) {
		if (input.length() % 2 == 0) {
			System.out.println(input.charAt(input.length()/2 - 1) + "" +  input.charAt(input.length() / 2));
		} else {
			System.out.println(input.charAt(input.length() / 2));
		}
	}
}
