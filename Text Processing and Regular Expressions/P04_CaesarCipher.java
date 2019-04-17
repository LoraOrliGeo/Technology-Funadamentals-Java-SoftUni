package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P04_CaesarCipher {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String res = "";
		
		for (int i = 0; i < input.length(); i++) {
			char symbol = (char)(input.charAt(i) + 3);
			res += symbol;
		}
		
		System.out.println(res);
	}
}
