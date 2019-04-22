package feb19_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> input = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String command = "";

		while (!"end".equals(command = sc.nextLine())) {
			String[] toDo = command.split("\\s+");
			String operation = toDo[0];
			int value = Integer.parseInt(toDo[1]);

			switch (operation) {
			case "Add":
				input.add(value);
				break;
			case "Remove":
				input.remove(Integer.valueOf(value));
				break;
			case "RemoveAt":
				input.remove(value);
				break;
			case "Insert":
				int index = Integer.parseInt(toDo[2]);
				input.add(index, value);
				break;
			}
		}
		
		System.out.println(input.toString().replaceAll("\\[|,|\\]", ""));
	}
}
