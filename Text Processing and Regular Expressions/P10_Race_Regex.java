package ex2_TextProcessingAndRegEx_20March2019;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_Race_Regex {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> players = new LinkedHashMap<>();
		String[] input = sc.nextLine().split(", ");

		for (int i = 0; i < input.length; i++) {
			players.putIfAbsent(input[i], 0);
		}

		String line = sc.nextLine();

		while (!line.equals("end of race")) {
			String name = "";
			int result = 0;

			Pattern patternLetter = Pattern.compile("[A-Za-z]+");
			Matcher matcherLetter = patternLetter.matcher(line);
			while (matcherLetter.find()) {
				name += matcherLetter.group();
			}

			Pattern patternDigit = Pattern.compile("\\d");
			Matcher matcherDigit = patternDigit.matcher(line);
			while (matcherDigit.find()) {
				result += Integer.parseInt(matcherDigit.group());
			}

			if (players.containsKey(name)) {
				players.put(name, players.get(name) + result);
			}

			line = sc.nextLine();
		}

		List<String> names = new LinkedList<>();
		players.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
				.forEach(p -> names.add(p.getKey()));

		System.out.printf("1st place: %s\n" + "2nd place: %s\n" + "3rd place: %s\n", names.get(0), names.get(1),
				names.get(2));
	}
}
