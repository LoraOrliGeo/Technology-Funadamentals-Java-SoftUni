package feb5_Arrays_Lab;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int day = Integer.parseInt(sc.nextLine());
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		switch (day) {
		case 1:
			System.out.println(daysOfWeek[0]);
			break;
		case 2:
			System.out.println(daysOfWeek[1]);
			break;
		case 3:
			System.out.println(daysOfWeek[2]);
			break;
		case 4:
			System.out.println(daysOfWeek[3]);
			break;
		case 5:
			System.out.println(daysOfWeek[4]);
			break;
		case 6:
			System.out.println(daysOfWeek[5]);
			break;
		case 7:
			System.out.println(daysOfWeek[6]);
			break;
		default:
			System.out.println("Invalid day!");
			break;
		}
	}
}
