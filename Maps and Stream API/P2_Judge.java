package ex1_more_MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class P2_Judge {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		Map<String, Map<String, Integer>> contestUsernamePoints = new LinkedHashMap<>();

		Map<String, Integer> userTotalPoints = new LinkedHashMap<>();

		String input = "";

		while (!"no more time".equals(input = sc.nextLine())) {
			String[] data = input.split(" -> ");
			String username = data[0];
			String contest = data[1];
			int points = Integer.parseInt(data[2]);

			if (!contestUsernamePoints.containsKey(contest)) {
				contestUsernamePoints.put(contest, new LinkedHashMap<>());

				userTotalPoints.putIfAbsent(username, 0);

				if (!contestUsernamePoints.get(contest).containsKey(username)) {
					contestUsernamePoints.get(contest).put(username, points);
					userTotalPoints.put(username, userTotalPoints.get(username) + points);
				} else {
					if (contestUsernamePoints.get(contest).get(username) < points) {
						contestUsernamePoints.get(contest).put(username, points);
						userTotalPoints.put(username, userTotalPoints.get(username) + points);
					}
				}
				
			} else {
				userTotalPoints.putIfAbsent(username, 0);
				
				if (!contestUsernamePoints.get(contest).containsKey(username)) {
					contestUsernamePoints.get(contest).put(username, points);
					userTotalPoints.put(username, userTotalPoints.get(username) + points);
				} else {
					if (contestUsernamePoints.get(contest).get(username) < points) {
						contestUsernamePoints.get(contest).put(username, points);
						userTotalPoints.put(username, points);
					}
				}
				
			}
		}
		
		
		contestUsernamePoints.entrySet().stream().forEach(kvp -> {
			System.out.println(String.format("%s: %d participants", kvp.getKey(), kvp.getValue().size()));
			Map<String, Integer> childMap = kvp.getValue();
			
			AtomicInteger ai = new AtomicInteger();
			ai.addAndGet(1);
			
			childMap.entrySet().stream().sorted((m1, m2) -> {
				int diff = Integer.compare(m2.getValue(), m1.getValue());

				if (diff == 0) {
					diff = m1.getKey().compareTo(m2.getKey());
				}
				return diff;
			}).forEach(n -> {
				System.out.println(ai.getAndIncrement() + ". " + n.getKey() + " <::> " + n.getValue());
			});
		});

		System.out.println("Individual standings:");
		Map<String, Integer> sortedIndividuals = new LinkedHashMap<>();

		userTotalPoints.entrySet().stream().sorted((m1, m2) -> {
			int diff = Integer.compare(m2.getValue(), m1.getValue());

			if (diff == 0) {
				diff = m1.getKey().compareTo(m2.getKey());
			}
			return diff;
		}).forEach(e -> sortedIndividuals.put(e.getKey(), e.getValue()));

		int iterator = 0;
		for (Map.Entry<String, Integer> kvp : sortedIndividuals.entrySet()) {
			++iterator;
			System.out.println(String.format("%d. %s -> %d", iterator, kvp.getKey(), kvp.getValue()));
		}
		
		// another way to number the keys of a map when using functional forEach:
		
// 		int[] count = {1};
		
// 		sortedIndividuals.entrySet().stream().forEach(e -> {
// 			System.out.println(String.format("%d. %s -> %d", count[0]++, e.getKey(), e.getValue()));
// 		});

	}
}
