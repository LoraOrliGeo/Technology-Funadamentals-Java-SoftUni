package feb20_Lists_MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String text = sc.nextLine();
		
		String output = "";
		
		int count = 0;

		while (!numbers.isEmpty()) {
			StringBuilder sb = new StringBuilder(text);
			int sumDigits = 0;
			int number = numbers.get(0);
			while (number > 0) {
				int lastDigit = number % 10;
				sumDigits += lastDigit;
				number /= 10;
			}
			
			char letter = ' ';
			for (int j = 0; j < text.length(); j++) {
				if (sumDigits > text.length()) {
					sumDigits -= text.length();
				}
				letter = text.charAt(sumDigits + count);
			}
			
			sb.deleteCharAt(sumDigits);
			output += letter;
			count++;
			numbers.remove(number);
		}

		System.out.println(output);

	}
}
