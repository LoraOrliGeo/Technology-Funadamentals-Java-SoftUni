package feb20_Lists_Exercises;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class P1_Train {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

//		List<Integer> wagons = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

		String[] inputData = sc.nextLine().split("\\s+");
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < inputData.length; i++) {
			numbers.add(Integer.parseInt(inputData[i]));
		}

		int maxCapacity = Integer.parseInt(sc.nextLine());

		String input = "";

		while (!"end".equals(input = sc.nextLine())) {
			String[] data = input.split("\\s+");

			if (data.length == 2) {
				numbers.add(Integer.parseInt(data[1]));
			} else {
				int number = Integer.parseInt(data[0]);

				for (int i = 0; i < numbers.size(); i++) {
					int current = numbers.get(i);
					
					if (current + number <= maxCapacity) {
						numbers.set(i, current + number);
						break;
					}
				}
			}
		}
		
		System.out.println(numbers.toString().replaceAll("\\[|,|\\]", ""));

	}
}
