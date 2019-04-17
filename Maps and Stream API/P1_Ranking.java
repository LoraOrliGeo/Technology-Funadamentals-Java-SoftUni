package ex1_more_MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1_Ranking {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		// C# -> https://pastebin.com/NejsvvLu
		// 60/100

		Scanner sc = new Scanner(System.in);

		Map<String, String> contestAndPass = new LinkedHashMap<>();

		Map<String, Map<String, Integer>> usernameContests = new LinkedHashMap<>();

		Map<String, Integer> bestUser = new LinkedHashMap<>();

		String line1 = "";

		while (!"end of contests".equals(line1 = sc.nextLine())) {
			String[] contest = line1.split(":");
			contestAndPass.putIfAbsent(contest[0], "");
			contestAndPass.put(contest[0], contest[1]);
		}

		String line2 = "";

		while (!"end of submissions".equals(line2 = sc.nextLine())) {
			String[] submission = line2.split("=>");
			String contest = submission[0];
			String password = submission[1];
			String username = submission[2];
			int points = Integer.parseInt(submission[3]);

			if (contestAndPass.containsKey(contest) && contestAndPass.get(contest).equals(password)) {
				if (!usernameContests.containsKey(username)) {
					usernameContests.put(username, new LinkedHashMap<>());
					if (!usernameContests.get(username).containsKey(contest)) {
						usernameContests.get(username).put(contest, points);
						bestUser.putIfAbsent(username, 0);
						bestUser.put(username, bestUser.get(username) + points);
					} else {
						if (usernameContests.get(username).get(contest) < points) {
							usernameContests.get(username).put(contest, points);
							bestUser.put(username, points);
							bestUser.put(username, bestUser.get(username) + points);
						}
					}
				} else {
					if (!usernameContests.get(username).containsKey(contest)) {
						usernameContests.get(username).put(contest, points);
						bestUser.putIfAbsent(username, 0);
						bestUser.put(username, bestUser.get(username) + points);
					} else {
						if (usernameContests.get(username).get(contest) < points) {
							usernameContests.get(username).put(contest, points);
							bestUser.put(username, points);
							bestUser.put(username, bestUser.get(username) + points);
						}
					}
				}
			}
		}

		int bestPoints = 0;
		String bestCandidate = "";

		for (Map.Entry<String, Integer> kvp : bestUser.entrySet()) {
			if (kvp.getValue() >= bestPoints) {
				bestPoints = kvp.getValue();
				bestCandidate = kvp.getKey();
			}
		}

		System.out.println(String.format("Best candidate is %s with total %d points.", bestCandidate, bestPoints));
		System.out.println("Ranking: ");
		usernameContests.entrySet().stream().sorted((m1, m2) -> {
			int diff = m1.getKey().compareTo(m2.getKey());
			return diff;
		}).forEach(e -> {
			System.out.println(e.getKey());
			Map<String, Integer> childMap = e.getValue();
			childMap.entrySet().stream().sorted((m1, m2) -> {
				int diff = Integer.compare(m2.getValue(), m1.getValue());
				return diff;
			}).forEach(n -> System.out.printf("#  %s -> %d%n", n.getKey(), n.getValue()));
		});
	}
}
