package feb20_Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4_ListOperations {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String input = "";

		while (!"End".equals(input = sc.nextLine())) {
			String[] data = input.split("\\s+");

			String command = data[0];

			switch (command) {
			case "Add":
				numbers.add(Integer.parseInt(data[1]));
				break;
			case "Insert":
				int element = Integer.parseInt(data[1]);
				int index = Integer.parseInt(data[2]);
				
				if (index >= 0 && index <= numbers.size()) {
					numbers.add(index, element);
				} else {
					System.out.println("Invalid index");
				}

				break;
			case "Remove":
				int indexToRemove = Integer.parseInt(data[1]);
				
				if (indexToRemove >= 0 && indexToRemove <= numbers.size()) {
					numbers.remove(indexToRemove);
				} else {
					System.out.println("Invalid index");
				}

				break;
			case "Shift":
				if (numbers.size() > 0) {
					int count = Integer.parseInt(data[2]) % numbers.size();
					count = count % numbers.size();
					
					if (data[1].equals("left")) {
						for (int i = 0; i < count; i++) {
							numbers.add(numbers.get(0));
							numbers.remove(0);
						}
						
					} else {
						for (int i = 0; i < count; i++) {
							numbers.add(0, numbers.get(numbers.size() - 1));
							numbers.remove(numbers.size() - 1);
						}
					}
				}
				break;
			}
		}
		
		System.out.println(numbers.toString().replaceAll("\\[|,|\\]", ""));
	}
}
