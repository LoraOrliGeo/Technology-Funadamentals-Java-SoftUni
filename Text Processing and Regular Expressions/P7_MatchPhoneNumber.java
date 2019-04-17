package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P7_MatchPhoneNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String phones = sc.nextLine();
		String regex = "^\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}$";
		
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(phones);
		
		List<String> matchedPhones = new ArrayList<>();
		
		while (matcher.find()) {
			matchedPhones.add(matcher.group());
		}
		
		System.out.println(matchedPhones.toString().replaceAll("\\[|\\]", ""));
	}
}