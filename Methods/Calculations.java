package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class Calculations {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String calculation = sc.nextLine();
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		
		if (calculation.equals("add")) {
			add(n1, n2);
		} else if (calculation.equals("subtract")) {
			subtract(n1, n2);
		} else if (calculation.equals("multiply")) {
			multiply(n1, n2);
		} else if (calculation.equals("divide")) {
			divide(n1, n2);
		} 
		
	}
	
	public static void add (int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public static void subtract (int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public static void multiply (int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	
	public static void divide (int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}
}
