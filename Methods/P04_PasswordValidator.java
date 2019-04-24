package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P04_PasswordValidator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();

		if (isCorectLenght(password) && containsLetersAndDigits(password) && haveAtLeast2Digits(password)) {
			System.out.println("Password is valid");
		}
		
		if (!isCorectLenght(password)) {
			System.out.println("Password must be between 6 and 10 characters");
		}
		if (!containsLetersAndDigits(password)) {
			System.out.println("Password must consist only of letters and digits");
		}
		if (!haveAtLeast2Digits(password)) {
			System.out.println("Password must have at least 2 digits");
		}
	}

	public static boolean isCorectLenght(String password) {
		if (password.length() >= 6 && password.length() <= 10) {
			return true;
		}
		return false;
	}

	public static boolean containsLetersAndDigits(String password) {
		boolean isLetterOrDigit = true;
		
		for (int i = 0; i < password.length(); i++) {
			char symbol = password.charAt(i);
			if (!Character.isLetterOrDigit(symbol)) {
				isLetterOrDigit = false;
			}
		}
		
		if (isLetterOrDigit) {
			return true;
		}
		return false;
	}

	public static boolean haveAtLeast2Digits(String password) {
		int count = 0;
		
		for (int i = 0; i < password.length(); i++) {
			char symbol = password.charAt(i);
			if (Character.isDigit(symbol)) {
				count++;
			}
		}
		
		if (count >= 2) {
			return true;
		} else {
			return false;
		}
	}
}
