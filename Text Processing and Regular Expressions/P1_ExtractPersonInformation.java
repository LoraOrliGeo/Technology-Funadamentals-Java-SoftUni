package ex2_TextProcessingAndRegEx_MoreEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1_ExtractPersonInformation {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();

			String nameRegex = "@([A-Za-z]+)\\|";
			Pattern namePattern = Pattern.compile(nameRegex);
			Matcher nameMatcher = namePattern.matcher(line);

			String ageRegex = "#([\\d]+)\\*";
			Pattern agePattern = Pattern.compile(ageRegex);
			Matcher ageMatcher = agePattern.matcher(line);

			if (nameMatcher.find() && ageMatcher.find()) {
				System.out.println(String.format("%s is %s years old.", nameMatcher.group(1), ageMatcher.group(1)));
			}
		}
	}
}
