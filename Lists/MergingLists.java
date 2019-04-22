package feb19_Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		List<Integer> first = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> second = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> result = new ArrayList<>();
		
		int shorter = (first.size() <= second.size()) ? first.size() : second.size();
		
		for (int i = 0; i < shorter; i++) {
			result.add(first.get(i));
			result.add(second.get(i));
		}
		
		if (first.size() > second.size()) {
			result.addAll(getRemainElementsOfLongerLost(first, second));
		} else if (second.size() > first.size()) {
			result.addAll(getRemainElementsOfLongerLost(second, first));
		}
		
		System.out.println(result.toString().replaceAll("\\[|,|\\]", ""));
	}
	
	public static List<Integer> getRemainElementsOfLongerLost (List<Integer> first, List<Integer> second) {
		List<Integer> result = new ArrayList<>();
		for (int i = second.size(); i < first.size(); i++) {
			result.add(first.get(i));
		}
		return result;
	}
}
