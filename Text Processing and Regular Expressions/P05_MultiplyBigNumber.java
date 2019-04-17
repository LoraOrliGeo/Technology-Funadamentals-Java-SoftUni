package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P05_MultiplyBigNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int multiplier = Integer.parseInt(sc.nextLine());
		String res = "";
		
		int reminder = 0;
		
		for (int i = input.length() - 1; i >= 0; i--) {
			char last = input.charAt(i);
			int lastdigit = Integer.parseInt(last + "");
			
			int multiplyLastD = lastdigit * multiplier;
			
			multiplyLastD += reminder;
			
			if (multiplyLastD >= 10) {
				res += multiplyLastD % 10;
				reminder = multiplyLastD / 10;
				
				if (i == 0) {
					res += reminder;
				}
			} else {
				res += multiplyLastD;
				reminder = 0;
			}
		}

		for (int i = res.length() - 1; i >= 0; i--) {
			if (res.charAt(res.length() - 1) == '0') {
				System.out.println(0);
				break;
			}
			System.out.print(res.charAt(i));
		}
	}
}
