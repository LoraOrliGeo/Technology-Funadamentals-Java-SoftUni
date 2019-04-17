package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String res = "";
		
		char firstOccur = input.charAt(0);
		res += firstOccur;
		
		for (int i = 1; i < input.length(); i++) {
			char currentSymbol = input.charAt(i);
			if (currentSymbol != firstOccur) {
				res += currentSymbol;
				firstOccur = currentSymbol;
			}
			
		}
		
		System.out.println(res);
	}
}
