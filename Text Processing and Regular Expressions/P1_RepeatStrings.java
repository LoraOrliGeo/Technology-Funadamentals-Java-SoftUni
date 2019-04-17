package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;

public class P1_RepeatStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] text = sc.nextLine().split("\\s+");
		
		String res = "";
		
		for (String word : text) {
			for (int i = 0; i < word.length(); i++) {
				res += word;
			}
		}
		
		System.out.println(res);
	}
}
