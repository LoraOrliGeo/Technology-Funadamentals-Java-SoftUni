package feb13_Methods_Functions_MoreExercises;

import java.util.Scanner;

public class LongerLine {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		//https://pastebin.com/8whuQxj1
		
		Scanner sc = new Scanner(System.in);
		
		double x1 = Double.parseDouble(sc.nextLine());
		double y1 = Double.parseDouble(sc.nextLine());
		double x2 = Double.parseDouble(sc.nextLine());
		double y2 = Double.parseDouble(sc.nextLine());
		
		double x3 = Double.parseDouble(sc.nextLine());
		double y3 = Double.parseDouble(sc.nextLine());
		double x4 = Double.parseDouble(sc.nextLine());
		double y4 = Double.parseDouble(sc.nextLine());		
		
		double firstLine = isCloser_GetLength(x1, y1, x2, y2);
		double secondLine = isCloser_GetLength(x3, y3, x4, y4);
		
		if (firstLine >= secondLine) {
			if (isCloser_GetLength(x1, y1, 0, 0) <= isCloser_GetLength(x2, y2, 0, 0)) {
				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
			} else {
				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
			}
		} else {
			if (isCloser_GetLength(x3, y3, 0, 0) <= isCloser_GetLength(x4, y4, 0 , 0)) {
				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
			} else {
				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
			}
		}
	}
	
	public static double isCloser_GetLength (double x1, double y1, double x2, double y2) {
		double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return res;
	}
}
