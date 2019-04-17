package lab1_MapsLambdaStreamAPI_12March2019;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P3_OddOccurrences {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] words = sc.nextLine().split("\\s+");
		
		Map<String, Integer> wordsByOddOccurance = new LinkedHashMap<>();
		
		for (String word : words) {
			String wordToLow = word.toLowerCase();
			if (wordsByOddOccurance.containsKey(wordToLow)) {
				wordsByOddOccurance.put(wordToLow, wordsByOddOccurance.get(wordToLow) + 1);
			} else {
				wordsByOddOccurance.put(wordToLow, 1);
			}
		}
		
		List<String> odds = new ArrayList<>();
		
		for (Map.Entry<String, Integer> word : wordsByOddOccurance.entrySet()) {
			if (word.getValue() % 2 == 1) {
				odds.add(word.getKey());
			}
		}
		
		System.out.println(odds.toString().replaceAll("\\[|\\]", ""));
				
	}
}
