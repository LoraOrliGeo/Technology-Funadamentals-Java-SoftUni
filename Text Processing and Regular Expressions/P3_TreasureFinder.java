package ex2_TextProcessingAndRegEx_MoreEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3_TreasureFinder {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<Integer> keys = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String line = "";

		while (!"find".equals(line = sc.nextLine())) {
			String decrypted = "";
			int count = -1;

			for (int i = 0; i < line.length(); i++) {
				if (i % keys.size() == 0) {
					count = 0;
				} else {
					count++;
				}
				char symbol = (char) (line.charAt(i) - keys.get(count));
				decrypted += symbol;
			}

			String treasure = decrypted.substring(decrypted.indexOf("&") + 1, decrypted.lastIndexOf("&"));
			String coordinates = decrypted.substring(decrypted.indexOf("<") + 1, decrypted.lastIndexOf(">"));

			System.out.println(String.format("Found %s at %s", treasure, coordinates));
		}
	}
}
