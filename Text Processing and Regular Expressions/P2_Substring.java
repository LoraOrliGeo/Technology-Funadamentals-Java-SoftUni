package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;

public class P2_Substring {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String key = sc.nextLine();
		String text = sc.nextLine();

		while (text.contains(key)) {
			text = text.replace(key, "");
		}

		System.out.println(text);
	}
}
