package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P08_FactorialDivision {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		long num1 = Integer.parseInt(sc.nextLine());
		long num2 = Integer.parseInt(sc.nextLine());

		double result = getFactorial(num1) / getFactorial(num2);
		System.out.printf("%.2f", result);

	}

	public static double getFactorial(long num) {
		long factorial = 1;

		for (long i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
}
