package feb19_Lists_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputArr = input.split("\\s+");
		int[] inputNums = new int[inputArr.length];
		
		for (int i = 0; i < inputNums.length; i++) {
			inputNums[i] = Integer.parseInt(inputArr[i]);
		}
		
		List<Integer> inputNumbers = new ArrayList<>();
		
		for (int i = 0; i < inputNums.length; i++) {
			inputNumbers.add(inputNums[i]);
		}
		
		int size = inputNumbers.size() / 2;
		for (int i = 0; i < size; i++) {
			int sum = inputNumbers.get(i) + inputNumbers.get(inputNumbers.size() - 1);
			inputNumbers.set(i, sum);
			inputNumbers.remove(inputNumbers.size() - 1);
		}
		
		System.out.println(inputNumbers.toString().replaceAll("\\[|,|\\]", ""));
	}
}
