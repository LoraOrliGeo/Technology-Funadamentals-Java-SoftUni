package feb20_Lists_Exercises;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_ChangeList_B {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String command = "";

		while (!"end".equals(command = sc.nextLine())) {
			String[] input = command.split("\\s+");
			String operation = input[0];
			int element = Integer.parseInt(input[1]);

			switch (operation) {
			case "Delete":
				numbers = numbers.stream().filter(e -> e != element).collect(Collectors.toList());
				break;
			case "Insert":
				int position = Integer.parseInt(input[2]);
				if (position >= 0 && position < numbers.size()) {
					numbers.add(position, element);
				}
				break;
			}
		}

		System.out.println(numbers.toString().replaceAll("\\[|,|\\]", ""));
	}

}
