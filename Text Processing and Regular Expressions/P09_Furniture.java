package ex2_TextProcessingAndRegEx_20March2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P09_Furniture {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String line = "";
		double totalSum = 0;
		List<String> bougthItems = new ArrayList<>();
		
		String regex = ">>(?<item>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
		
		Pattern pattern = Pattern.compile(regex);
		
		while (!"Purchase".equals(line = sc.nextLine())) {
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				bougthItems.add(matcher.group("item"));
				double itemPrice = Double.parseDouble(matcher.group("price"));
				int quantity = Integer.parseInt(matcher.group("quantity"));
				totalSum += itemPrice * quantity;
			}
		}
		
		System.out.println("Bought furniture:");
		for (String item : bougthItems) {
			System.out.println(item);
		}
		System.out.printf("Total money spend: %.2f", totalSum);
	}
}
