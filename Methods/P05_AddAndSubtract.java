package feb13_Methods_Functions_Exercises;

import java.util.Scanner;

public class P05_AddAndSubtract {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		
		System.out.println(subtract(sum(num1, num2), num3));
	}
	
	public static int sum (int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtract (int num, int num3) {
		return num - num3;
	}
}
