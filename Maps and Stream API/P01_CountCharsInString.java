package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInString {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] words = sc.nextLine().split("\\s+");
		
		Map<Character, Integer> counts = new LinkedHashMap<>();
		
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				char letter = word.charAt(i);
				
				counts.putIfAbsent(letter, 0);
				counts.put(letter, counts.get(letter) + 1);
			}
		}
		
		for (Character letter : counts.keySet()) {
			System.out.println(String.format("%c -> %d", letter, counts.get(letter)));
		}
		
	}
}
