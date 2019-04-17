package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P9_MatchNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";
		
		List<String> matchedNumbers = new ArrayList<>();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			matchedNumbers.add(matcher.group());
		}
		
		System.out.println(String.join(" ", matchedNumbers));
	}
}
