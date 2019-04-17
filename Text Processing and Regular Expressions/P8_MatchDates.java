package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P8_MatchDates {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String dates = sc.nextLine();
		
		String regex = "\\b(?<day>\\d{2})(\\.|\\/|\\-)(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dates);
		
		while (matcher.find()) {
			System.out.println(String.format("Day: %s, Month: %s, Year: %s", 
					matcher.group("day"), matcher.group("month"), matcher.group("year")));
		}
	}
}
