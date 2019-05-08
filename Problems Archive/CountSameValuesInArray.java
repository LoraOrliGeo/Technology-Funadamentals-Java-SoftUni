package setsAndMaps_Lab_Archive;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountSameValuesInArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		List<String> numbers = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
		
		Map<String, Integer> valuesCount = new HashMap<>();
		
		for (int i = 0; i < numbers.size(); i++) {
			String number = numbers.get(i) + "";
			if (!valuesCount.containsKey(number)) {
				valuesCount.put(number, 0);
			}
			
			valuesCount.put(number, valuesCount.get(number) + 1);
		}
		
		for (Entry<String, Integer> kvp : valuesCount.entrySet()) {
			System.out.println(String.format("%s - %d times", kvp.getKey(), kvp.getValue()));
		}
	}
}
