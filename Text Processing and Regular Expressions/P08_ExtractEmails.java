package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08_ExtractEmails {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String regex = "\\s(?<user>[A-Za-z][\\w.-]+)@([a-z-?]+)(\\.[a-z]+)+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			System.out.println(matcher.group().trim());
		}
	}
}
