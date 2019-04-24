package feb13_Methods_Functions_MoreExercises;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		
		if (input.equals("int")) {
			int number = Integer.parseInt(sc.nextLine());
			int result = number * 2;
			System.out.println(result);
		} else if (input.equals("real")) {
			double number = Double.parseDouble(sc.nextLine());;
			double result = number * 1.5;
			System.out.printf("%.2f", result);
		} else if (input.equals("string")) {
			String result = sc.nextLine();
			System.out.println("$" + result + "$");
		}
	}
	
//	public static void getDataType(String input) {
//		String result = "";
//		for (int i = 0; i < input.length(); i++) {
//			try {
//				int number = input.charAt(i);
//				result += number + "";
//			} catch (Exception e){
//				continue;
//			}
//		}
//		
//	}
}
