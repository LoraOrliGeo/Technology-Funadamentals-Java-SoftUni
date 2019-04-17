package ex2_TextProcessingAndRegEx_MoreEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P7_RageQuit {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine().toUpperCase();

		StringBuilder result = new StringBuilder();

		String regex = "(?<sym>[\\D]+)(?<num>[\\d]+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			int num = Integer.parseInt(matcher.group("num"));
			for (int j = 0; j < num; j++) {
				result.append(matcher.group("sym"));
			}
		}

		long uniqueSym = result.chars().distinct().count();
		System.out.println(String.format("Unique symbols used: %d", uniqueSym));
		System.out.println(result);
	}
}
