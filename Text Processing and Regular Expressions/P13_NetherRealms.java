package ex2_TextProcessingAndRegEx_20March2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P13_NetherRealms {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String[] demons = sc.nextLine().split(",\\s+");

		Map<String, List<Double>> output = new TreeMap<>();

		for (int i = 0; i < demons.length; i++) {
			String demon = demons[i];
			double health = 0;
			double damage = 0;
			char previous = ' ';
			String toAdd = "";

			String regexH = "[^\\d\\.+\\-*\\/]";
			Pattern patternH = Pattern.compile(regexH);
			Matcher matcherH = patternH.matcher(demon);

			while (matcherH.find()) {
				toAdd += matcherH.group();
			}

			for (int j = 0; j < toAdd.length(); j++) {
				char symbolInt = toAdd.charAt(j);
				health += symbolInt;
			}
			
			for (int k = 0; k < demon.length(); k++) {
				char symbol = demon.charAt(k);
				
				if (Character.isDigit(symbol)) {
					String sub = demon.substring(k);
					String regexNum = "[\\d.?\\d]+";
					Pattern pattern = Pattern.compile(regexNum);
					Matcher matcher = pattern.matcher(sub);
					if (matcher.find()) {
						if (previous == '-') {
							damage -= Double.parseDouble(matcher.group());
						} else {
							damage += Double.parseDouble(matcher.group());
						}
						int jump = matcher.group().length();
						k += jump - 1;
					}
				}

				if (symbol == '*') {
					damage *= 2;
				} else if (symbol == '/') {
					damage /= 2;
				}
				
				previous = demon.charAt(k);
			}
			
			output.putIfAbsent(demon, new ArrayList<>());
			output.get(demon).add(health);
			output.get(demon).add(damage);
		}

		output.entrySet().stream().forEach(kvp -> {
			System.out.println(String.format("%s - %.0f health, %.2f damage", kvp.getKey(), kvp.getValue().get(0),
					kvp.getValue().get(1)));
		});
	}
}