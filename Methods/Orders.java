package feb12_Methods_Functions_Lab;

import java.util.Scanner;

public class Orders {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String product = sc.nextLine();
		int quantity = Integer.parseInt(sc.nextLine());

		switch (product) {
		case "coffee":
			getTotalSum(quantity, 1.5);
			break;
		case "coke":
			getTotalSum(quantity, 1.4);
			break;
		case "water":
			getTotalSum(quantity, 1.0);
			break;
		case "snacks":
			getTotalSum(quantity, 2.0);
			break;
		}
	}

	static void getTotalSum(int quantity, double price) {
		double totalSum = quantity * price;
		System.out.printf("%.2f", totalSum);
	}
}
