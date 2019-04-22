package feb20_Lists_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3_HouseParty {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		List<String> names = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			String inputData = sc.nextLine();
			String[] input = inputData.split("\\s+");
			
			String name = input[0];

			if (input.length == 3) {
				if (!names.contains(name)) {
					names.add(name);
				} else {
					System.out.printf("%s is already in the list!%n", name);
				}
			} else if (input.length == 4) {
				if (names.contains(name)) {
					names.remove(name);
				} else {
					System.out.printf("%s is not in the list!%n", name);
				}
			} 
		}

		String output = names.toString().replaceAll("\\[|,|\\]", "");
		System.out.println(output.replaceAll("\\s+", "\n"));
	}
}
