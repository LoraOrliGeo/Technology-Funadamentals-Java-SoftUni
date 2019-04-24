package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = Integer.parseInt(sc.nextLine());
		
		System.out.println(repeatString(input, count));
		
	}
	
	public static String repeatString (String str, int count) {
		String output = "";
		for (int i = 1; i <= count; i++) {
			output += str;
		}
		return output;
	}
}
