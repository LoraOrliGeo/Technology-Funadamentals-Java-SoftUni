package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		double width = Double.parseDouble(sc.nextLine());
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.printf("%.0f",caclArea(width, height));
	}

	private static double caclArea(double width, double height) {
		return width * height;
	}
	
	 
}
