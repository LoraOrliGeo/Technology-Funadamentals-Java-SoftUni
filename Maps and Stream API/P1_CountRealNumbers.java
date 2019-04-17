package lab1_MapsLambdaStreamAPI_12March2019;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class P1_CountRealNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		List<Double> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
		
		TreeMap<Double, Integer> numbersByOccurance = new TreeMap<>();
		
		for (Double number : numbers) {
			if (!numbersByOccurance.containsKey(number)) {
				numbersByOccurance.put(number, 0);
			}
			numbersByOccurance.put(number, numbersByOccurance.get(number) + 1);
		}
		
		for (Map.Entry<Double, Integer> entry : numbersByOccurance.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.######");
			System.out.println(String.format("%s -> %d", df.format(entry.getKey()), entry.getValue()));
		}
	}
}
