package feb20_Lists_MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		double savings = Double.parseDouble(sc.nextLine());
		
		List<Integer> drumSet = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		
		String command = "";
		
		List<Integer> initialQualitySet = new ArrayList<>();
		
		for (Integer initalQualityDrum : drumSet) {
			initialQualitySet.add(initalQualityDrum);
		}
		
		while (!"Hit it again, Gabsy!".equals(command = sc.nextLine())) {
			int hitPower = Integer.parseInt(command);
			
			for (int i = 0; i < drumSet.size(); i++) {
				drumSet.set(i, drumSet.get(i) - hitPower);
				
				if (drumSet.get(i) <= 0) {
					if (savings - (initialQualitySet.get(i) * 3) > 0) {
						drumSet.set(i, initialQualitySet.get(i));
						savings -= initialQualitySet.get(i) * 3;
					} else {
						drumSet.remove(i);
						initialQualitySet.remove(i);
						i -= 1;
					}
				}
			}
		}
		
		System.out.println(drumSet.toString().replaceAll("\\]|\\[|,", ""));
		System.out.printf("Gabsy has %.2flv.", savings);
	}
}
