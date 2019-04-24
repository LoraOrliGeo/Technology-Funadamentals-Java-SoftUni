package feb12_Methods_Functions_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		double number = Double.parseDouble(sc.nextLine());
		double power = Double.parseDouble(sc.nextLine());

		DecimalFormat df = new DecimalFormat("#.####");

		System.out.println(df.format(power(number, power)));
	}

	public static double power(double num, double pow) {
		return Math.pow(num, pow);
	}
}
