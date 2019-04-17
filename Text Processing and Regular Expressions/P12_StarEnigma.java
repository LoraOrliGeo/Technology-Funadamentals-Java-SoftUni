package ex2_TextProcessingAndRegEx_20March2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12_StarEnigma {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String reg = "[STARstar]";
		// or [star] with flag: Pattern.Case_insensitive;
		Pattern pat = Pattern.compile(reg);
		
		int n = Integer.parseInt(sc.nextLine());
		
		List<String> attack = new ArrayList<>();
		List<String> destroyed = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			Matcher match = pat.matcher(input);
			
			int count = 0;
			
			while (match.find()) {
				count++;
			}
			
			String decrypted = "";
			for (int j = 0; j < input.length(); j++) {
				char symbol = (char)(input.charAt(j) - count);
				decrypted += symbol;
			}
			
			String regex = "@(?<name>[A-Za-z]+)(?:[^@:!>\\-]*):(?<population>[\\d]+)(?:[^@:!>\\-]*)!(?<type>[AD])!(?:[^@:\\-!>]*)->(?<soldiers>\\d+)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(decrypted);
			
			while (matcher.find()) {
				String type = matcher.group("type");
				if (type.equals("A")) {
					attack.add(matcher.group("name"));
				} else {
					destroyed.add(matcher.group("name"));
				}
			}
		}
		
		System.out.println(String.format("Attacked planets: %d", attack.size()));
		attack.stream().sorted().forEach(e -> {
			System.out.println(String.format("-> %s", e));
		});
		
		System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
		destroyed.stream().sorted().forEach(e -> {
			System.out.println(String.format("-> %s", e));
		});
	}
}
