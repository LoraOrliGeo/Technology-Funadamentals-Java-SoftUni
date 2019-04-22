package feb19_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		numbers = numbers.stream().filter(e -> e >= 0).collect(Collectors.toList());

		if (numbers.size() != 0) {
			for (int i = 0; i < numbers.size() / 2; i++) {
				int current = numbers.get(i);
				numbers.set(i, numbers.get(numbers.size() - 1 - i));
				numbers.set(numbers.size() - 1 - i, current);
			}
			System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));
		} else {
			System.out.println("empty");
		}
		
	}
}
