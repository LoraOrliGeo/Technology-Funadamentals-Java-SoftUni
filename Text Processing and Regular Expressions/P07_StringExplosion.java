package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P07_StringExplosion {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		String result = "";

		for (int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);

			if (symbol == '>') {
				result += ">";
				i++;
				int explosion = text.charAt(i) - '0';
				explosion--;

				while (explosion > 0 && i < text.length() - 1) {
					i++;
					symbol = text.charAt(i);
					if (symbol == '>') {
						result += ">";
						i++;
						explosion += text.charAt(i) - '0';
						explosion--;
						continue;
					}
					explosion--;
				}

			} else {
				result += symbol;
			}
		}

		System.out.println(result);
	}
}
