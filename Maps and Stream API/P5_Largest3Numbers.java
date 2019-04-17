package lab1_MapsLambdaStreamAPI_12March2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_Largest3Numbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.sorted((n1, n2) -> n2.compareTo(n1)).limit(3).collect(Collectors.toList());
		
		System.out.println(numbers.toString().replaceAll("\\[|,|\\]", ""));
	}
}
