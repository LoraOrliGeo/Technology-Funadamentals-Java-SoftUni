package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResults {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> nameNpoints = new LinkedHashMap<>();
		Map<String, Integer> languageNsubmissions = new LinkedHashMap<>();

		String line = "";

		while (!"exam finished".equals(line = sc.nextLine())) {
			String[] data = line.split("\\-");
			String name = data[0];
			String language = data[1];

			if (data.length > 2) {
				int points = Integer.parseInt(data[2]);
				nameNpoints.putIfAbsent(name, points);

				if (points > nameNpoints.get(name)) {
					nameNpoints.put(name, points);
				}
			}

			if (language.equals("banned")) {
				nameNpoints.remove(name);
				continue;
			}

			if (!languageNsubmissions.containsKey(language)) {
				languageNsubmissions.put(language, 1);
			} else {
				languageNsubmissions.put(language, languageNsubmissions.get(language) + 1);
			}
		}

		System.out.println("Results:");
		nameNpoints.entrySet().stream().sorted((m1, m2) -> {
			int sort = Integer.compare(m2.getValue(), m1.getValue());

			if (sort == 0) {
				sort = m1.getKey().compareTo(m2.getKey());
			}
			return sort;
		}).forEach(kvp -> System.out.println(String.format("%s | %d", kvp.getKey(), kvp.getValue())));

		System.out.println("Submissions:");
		languageNsubmissions.entrySet().stream().sorted((m1, m2) -> {
			int sort = Integer.compare(m2.getValue(), m1.getValue());

			if (sort == 0) {
				sort = m1.getKey().compareTo(m2.getKey());
			}
			return sort;
		}).forEach(kvp -> System.out.println(String.format("%s - %d", kvp.getKey(), kvp.getValue())));
	}
}
