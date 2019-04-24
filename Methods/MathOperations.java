package feb12_Methods_Functions_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int number1 = Integer.parseInt(sc.nextLine());
		String operator = sc.nextLine();
		int number2 = Integer.parseInt(sc.nextLine());
		
		DecimalFormat df = new DecimalFormat ("##.##");
		
		System.out.println(df.format(operations(number1, operator, number2)));
	}
	
	public static double operations (int number1, String operator, int number2) {
		double res = 0;
		switch (operator) {
		case "*":
			res = number1 * number2;
			break;
		case "/":
			res = number1 / number2;
			break;
		case "+":
			res = number1 + number2;
			break;
		case "-":
			res = number1 - number2;
			break;
		}
		return res;
	}
}
