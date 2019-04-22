package feb19_Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> input = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String command = "";
		final String stop = "end";
		while (!stop.equals(command = sc.nextLine())) {
			String[] inputData = command.split("\\s+");
			String toDo = inputData[0];

			switch (toDo) {
			case "Contains":
				int number = Integer.parseInt(inputData[1]);
				boolean isNumberInList = input.contains(number);
				String result = isNumberInList ? "Yes" : "No such number";
				System.out.println(result);
				break;
			case "Print":
				int reminder = inputData[1].equals("even") ? 0 : 1;
				input.stream().filter(n -> n % 2 == reminder).forEach(n -> System.out.print(n + " "));
				System.out.println();
				break;
			case "Get":
				int sum = input.stream().map(e -> e.intValue()).reduce(0, (e, r) -> e + r).intValue();
				System.out.println(sum);
				break;
			case "Filter":
				String condition = inputData[1];
				int numberCond = Integer.parseInt(inputData[2]);
				
				List<Integer> output = new ArrayList<>();
				
				switch (condition) {
				case "<":
					output = input.stream().filter(e -> e < numberCond).collect(Collectors.toList());
					break;
				case "<=":
					output = input.stream().filter(e -> e <= numberCond).collect(Collectors.toList());
					break;
				case ">":
					output = input.stream().filter(e -> e > numberCond).collect(Collectors.toList());
					break;
				case ">=":
					output = input.stream().filter(e -> e >= numberCond).collect(Collectors.toList());
					break;
				}
				System.out.println(output.toString().replaceAll("\\[|,|\\]", ""));
				break;
			}
		}
	}
}
