package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P14_LettersChangeNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split("\\s+");
		
		//((?<=(?<uppBef>[A-Z]))|(?<=(?<lowBef>[a-z])))(?<number>[\d]+)((?=(?<uppAft>[A-Z]))|(?=(?<lowAft>[a-z])))
		
		double total = 0;
		
		for (String in : input) {
			double sum = 0;
			String num = in.substring(1, in.length() - 1);
			double number = Double.parseDouble(num);
			
			int tempBef = 0;
			char[] before = in.substring(0, 1).toCharArray();
			tempBef = (int) before[0];
			
			if (tempBef <= 122 & tempBef >= 97) {
				int tempIntLower = 96; // lowercase
				number *= (tempBef - tempIntLower) * 1.0;
			}
			
			if (tempBef <= 90 & tempBef >= 65) {
				int tempIntUpp = 64; // uppercase
				number /= (tempBef - tempIntUpp) * 1.0;
			}
			
			int tempAft = 0;
			char[] after = in.substring(num.length() + 1).toCharArray();
			tempAft = (int) after[0];
			
			if (tempAft <= 122 && tempAft >= 97) {
				int tempIntLower = 96; // lowercase
				number += (tempAft - tempIntLower) * 1.0;
			}
			
			if (tempAft <= 90 && tempAft >= 65) {
				int tempIntUpp = 64; // uppercase
				number -= (tempAft - tempIntUpp) * 1.0;
			}
			
			sum += number;
			total += sum;
		}

		System.out.printf("%.2f", total);
	}
}
