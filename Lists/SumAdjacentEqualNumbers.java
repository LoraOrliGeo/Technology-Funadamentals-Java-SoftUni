package feb19_Lists_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Double> nums = Arrays.stream(sc.nextLine().split("\\s+")).map(Double::parseDouble)
				.collect(Collectors.toList());

		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i).equals(nums.get(i + 1))) {
				nums.set(i, (nums.get(i) + nums.get(i + 1)));
				nums.remove(nums.get(i + 1));
				i = -1;
			}
		}
		
		join(nums, " ");
	}

	public static void join(List<Double> nums, String delimeter) {
		DecimalFormat df = new DecimalFormat("#.###");
		String output = "";
		for (double num : nums) {
			String formatted = df.format(num);
			output += formatted + delimeter;
		}
		System.out.println(output);
	}
}
