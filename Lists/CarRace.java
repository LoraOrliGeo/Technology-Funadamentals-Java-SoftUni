package feb20_Lists_MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		double timeFirst = 0;
		double timeSecond = 0;

		for (int i = 0; i < numbers.size() / 2; i++) {
			timeFirst += numbers.get(i);
			if (numbers.get(i) == 0) {
				timeFirst = 0.8 * timeFirst;
			}
			
			timeSecond += numbers.get(numbers.size() - 1 - i);
			if (numbers.get(numbers.size() - 1 - i) == 0) {
				timeSecond = 0.8 * timeSecond;
			}
		}
		
		if (timeFirst < timeSecond) {
			System.out.printf("The winner is left with total time: %.1f", timeFirst);
		} else if (timeSecond < timeFirst) {
			System.out.printf("The winner is right with total time: %.1f", timeSecond);
		}
	}
}
