package ex2_TextProcessingAndRegEx_MoreEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P6_WinningTicket {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split("\\s*,\\s*");

		String regex = "[@#\\$^]";
		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < input.length; i++) {
			String ticket = input[i];
			int leftCount = 0;
			int rightCount = 0;

			if (ticket.length() != 20) {
				System.out.println("invalid ticket");
				continue;
			}

			String leftSymbol = "";
			String rightSymbol = "";
			String printSymbol = "";

			if (ticket.length() == 20) {
				for (int j = 0; j < ticket.length() / 2; j++) {
					leftSymbol = ticket.charAt(j) + "";
					rightSymbol = ticket.charAt(ticket.length() - 1 - j) + "";
					Matcher leftMatcher = pattern.matcher(leftSymbol);
					Matcher rightMatcher = pattern.matcher(rightSymbol);
					if (leftMatcher.find()) {
						leftCount++;
						printSymbol = leftSymbol;
					}
					if (rightMatcher.find()) {
						rightCount++;
						printSymbol = rightSymbol;
					}
				}
			}

			if (leftCount == 0 && rightCount == 0) {
				System.out.println(String.format("ticket \"%s\" - no match", ticket));
			} else {
				if (leftCount == 10 && rightCount == 10) {
					System.out.println(String.format("ticket \"%s\" - %d%s Jackpot!", ticket, leftCount, printSymbol));
				} else {
					int sym = Math.min(leftCount, rightCount);
					System.out.println(String.format("ticket \"%s\" - %d%s", ticket, sym, printSymbol));
				}
			}
		}
	}
}
