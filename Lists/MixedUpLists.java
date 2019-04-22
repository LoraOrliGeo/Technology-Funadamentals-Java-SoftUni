package feb20_Lists_MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MixedUpLists {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> first = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> second = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		int shorter = Math.min(first.size(), second.size());

		List<Integer> mix = new ArrayList<>();

		for (int i = 0; i < shorter; i++) {
			mix.add(first.get(i));
			mix.add(second.get(second.size() - 1 - i));
		}

		int lowerBound = 0;
		int upperBound = 0;

		if (first.size() < second.size()) {
			if (second.get(0) < second.get(1)) {
				lowerBound = second.get(0);
				upperBound = second.get(1);
			} else {
				lowerBound = second.get(1);
				upperBound = second.get(0);
			}
		} else if (second.size() < first.size()) {
			if (first.get(first.size() - 1) < first.get(first.size() - 2)) {
				lowerBound = first.get(first.size() - 1);
				upperBound = first.get(first.size() - 2);
			} else {
				lowerBound = first.get(first.size() - 2);
				upperBound = first.get(first.size() - 1);
			}
		}

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < mix.size(); i++) {
			if (mix.get(i) > lowerBound && mix.get(i) < upperBound) {
				result.add(mix.get(i));
			}
		}

		result = result.stream().sorted().collect(Collectors.toList());

		System.out.println(result.toString().replaceAll("\\[|,|\\]", ""));

	}
}
