package ex1_more_MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class P3_MOBAChallenger {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		Map<String, Map<String, Integer>> tier = new LinkedHashMap<>();
		Map<String, Integer> totalSkill = new LinkedHashMap<>();

		String input = "";

		while (!"Season end".equals(input = sc.nextLine())) {

			if (input.contains("->")) {
				String[] data = input.split("\\s+->\\s+");
				String player = data[0];
				String position = data[1];
				int skill = Integer.parseInt(data[2]);

				if (!tier.containsKey(player)) {
					tier.put(player, new LinkedHashMap<>());
					totalSkill.putIfAbsent(player, 0);

					if (!tier.get(player).containsKey(position)) {
						tier.get(player).put(position, skill);
						totalSkill.put(player, totalSkill.get(player) + skill);
					} else {
						if (tier.get(player).get(position) < skill) {
							tier.get(player).put(position, skill);
							totalSkill.put(player, totalSkill.get(player) + skill);
						}
					}
				} else {
					totalSkill.putIfAbsent(player, 0);

					if (!tier.get(player).containsKey(position)) {
						tier.get(player).put(position, skill);
						totalSkill.put(player, totalSkill.get(player) + skill);
					} else {
						if (tier.get(player).get(position) < skill) {
							tier.get(player).put(position, skill);
							totalSkill.put(player, totalSkill.get(player) + skill);
						}
					}
				}
			} else if (input.contains("vs")) {
				String[] data = input.split("\\s+vs\\s+");
				String firstPlayer = data[0];
				String secondPlayer = data[1];

				if (tier.containsKey(firstPlayer) && tier.containsKey(secondPlayer)) {
					Set<String> positionsF = tier.get(firstPlayer).keySet();
					Set<String> positionsS = tier.get(secondPlayer).keySet();

					boolean commonPosition = false;

					for (String positionF : positionsF) {
						for (String positionS : positionsS) {
							if (positionF.equals(positionS)) {
								commonPosition = true;
							}
						}
					}

					if (commonPosition) {
						int pointsF = totalSkill.get(firstPlayer);
						int pointsS = totalSkill.get(secondPlayer);

						if (pointsF > pointsS) {
							tier.remove(secondPlayer);
							totalSkill.remove(secondPlayer);
						} else if (pointsS > pointsF) {
							tier.remove(firstPlayer);
							totalSkill.remove(firstPlayer);
						}
					}
				}
			}
		}

		totalSkill.entrySet().stream().sorted((m1, m2) -> {
			int diff = Integer.compare(m2.getValue(), m1.getValue());

			if (diff == 0) {
				diff = m1.getKey().compareTo(m2.getKey());
			}
			return diff;
		}).forEach(n -> {
			System.out.println(String.format("%s: %d skill", n.getKey(), n.getValue()));
			Map<String, Integer> childMap = tier.get(n.getKey());
			childMap.entrySet().stream().sorted((k1, k2) -> {
				int sort = Integer.compare(k2.getValue(), k1.getValue());
				if (sort == 0) {
					sort = k1.getKey().compareTo(k2.getKey());
				}
				return sort;
			}).forEach(e -> System.out.println(String.format("- %s <::> %d", e.getKey(), e.getValue())));
		});
	}
}
