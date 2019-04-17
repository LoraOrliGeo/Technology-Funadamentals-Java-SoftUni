package lab2_TextProcessingAndRegularExpressions_19March2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P6_MatchFullName {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
		String text = sc.nextLine();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
		
		
//		String[] input = sc.nextLine().split(", ");
//		String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";
//		
//		Pattern pattern = Pattern.compile(regex);
//		
//		for (String name : input) {
//			Matcher matcher = pattern.matcher(name);
//			if (matcher.find()) {
//				System.out.print(matcher.group() + " ");
//			}
//		}
		
	}
}
