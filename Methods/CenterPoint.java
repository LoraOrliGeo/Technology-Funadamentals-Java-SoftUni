package feb13_Methods_Functions_MoreExercises;

import java.util.Scanner;

public class CenterPoint {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int x1 = Integer.parseInt(sc.nextLine());
		int y1 = Integer.parseInt(sc.nextLine());
		int x2 = Integer.parseInt(sc.nextLine());
		int y2 = Integer.parseInt(sc.nextLine());
		
		double radius1 = getMinRadius(x1, y1);
		double radius2 = getMinRadius(x2, y2);
		
		if (radius1 <= radius2) {
			System.out.printf("(%d, %d)", x1, y1);
		} else if (radius2 < radius1) {
			System.out.printf("(%d, %d)", x2, y2);
		} 
		
	}
	
	public static double getMinRadius(int x, int y) {
		double minRadius = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		return minRadius;
	}
}
