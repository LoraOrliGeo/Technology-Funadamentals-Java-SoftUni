package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P03_CharactersInRange {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		char first = sc.nextLine().charAt(0);
		char second = sc.nextLine().charAt(0);
		
		char start = ' ';
		char end = ' ';
		
		if (second < first) {
			start = second;
			end = first;
		} else if (first < second) {
			start = first;
			end = second;
		}
		System.out.println(printLineBetween(start, end));

	}
	
	public static String printLineBetween (char start, char end) {
		String line = "";
		for (int i = start + 1; i < end; i++) {
			line += (char)i + " ";
		}
		return line;
	}
}
