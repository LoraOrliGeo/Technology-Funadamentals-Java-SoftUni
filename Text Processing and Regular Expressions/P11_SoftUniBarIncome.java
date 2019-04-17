package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P11_SoftUniBarIncome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		// %(?<customer>[A-Z][a-z]+)%<(?<item>.*?)>\|(?<count>\d+)\|(?<price>[\d.]+)\$
		/*
		 * %George%<Croissant>|2|10.35$ %Peter%<Gum>|1|1.3$ %Maria%<Cola>|1|2.4$
		 * %InvalidName%<Croissant>|2|10.3$ %Peter%<Gum>1.3$ %Maria%<Cola>|1|2.4
		 * %Valid%<Valid>valid|10|valid20$
		 */
		// (?:[^|$%.])

		String input = "";

		double totalIncome = 0;

		String regex = "%(?<customer>[A-Z][a-z]+)%(?:[^|$%.]*)<(?<item>[^<>]+)>(?:[^|$%.]*)\\|(?<count>\\d+)\\|(?:[^|$%.]*?)(?<price>[-+]?\\d+\\.?\\d+)\\$";
		Pattern pattern = Pattern.compile(regex);

		while (!"end of shift".equals(input = sc.nextLine())) {
			Matcher matcher = pattern.matcher(input);
			if (matcher.find()) {
				String customer = matcher.group("customer");
				String item = matcher.group("item");
				int count = Integer.parseInt(matcher.group("count"));
				double price = Double.parseDouble(matcher.group("price"));
				double total = count * price;
				totalIncome += total;
				System.out.println(String.format("%s: %s - %.2f", customer, item, total));
			}
		}

		System.out.printf("Total income: %.2f", totalIncome);
	}
}
