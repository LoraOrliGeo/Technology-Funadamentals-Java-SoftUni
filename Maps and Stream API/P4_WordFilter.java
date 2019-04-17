package lab1_MapsLambdaStreamAPI_12March2019;

import java.util.Arrays;
import java.util.Scanner;

public class P4_WordFilter {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] words =  Arrays.stream(sc.nextLine().split("\\s+")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);
		
		for (String word : words) {
			System.out.println(word);
		}
	}
}
