package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		// https://pastebin.com/8CsFbetj

		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine().toLowerCase();

		if (type.equals("int")) {

			int num1 = Integer.parseInt(sc.nextLine());
			int num2 = Integer.parseInt(sc.nextLine());
			System.out.println(getMax(num1, num2));

		} else if (type.equals("char")) {

			char char1 = sc.nextLine().charAt(0);
			char char2 = sc.nextLine().charAt(0);
			System.out.println(getMax(char1, char2));

		} else if (type.equals("string")) {

			String input1 = sc.nextLine();
			String input2 = sc.nextLine();
			System.out.println(getMax(input1, input2));

		}
	}

	public static int getMax(int input1, int input2) {
		if (input1 > input2) {
			return input1;
		}
		return input2;
	}
	
	public static char getMax (char input1, char input2) {
		if (input1 > input2) {
		return input1;
		}
		return input2;
	}

	public static String getMax(String input1, String input2) {
		String maxString = "";
		if (input1.compareTo(input2) > 0) {
			maxString = input1;
		} else {
			maxString = input2;
		}
		return maxString;
	}
}
