package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class PrintingTriangle {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			printTriangle(1, i);
		}
		for (int i = n - 1; i >= 1; i--) {
			printTriangle(1, i);
		}
		
//		// solution without method:
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		for (int i = n - 1; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
	}

	public static void printTriangle(int go, int stop) {
		for (int i = go; i <= stop; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
