package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P09_PalindromeIntegers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String input = " ";
		
		while(!"END".equals(input = sc.nextLine())) {
			boolean isPalindrom = true;
			for (int i = 0; i < input.length() / 2; i++) {
				if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
					isPalindrom = false;
				}
			}
			System.out.println(isPalindrom);
		}
		
		//another way - with reversed String:
//		while (true) {
//			input = sc.nextLine();
//			if (input.equals("END")) {
//				break;
//			}
//			String reversed = "";
//			for (int i = 0; i < input.length(); i++) {
//				reversed += input.charAt(input.length() - 1 - i);
//			}
//			if (reversed.equals(input)) {
//				System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
//		}
		
	}
}
