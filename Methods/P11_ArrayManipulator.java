package feb13_Methods_Functions_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P11_ArrayManipulator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split("\\s+");
		int[] numbers = new int[input.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}

		String inputData = "";

		while (!"end".equals(inputData = sc.nextLine())) {

			String[] data = inputData.split("\\s+");
			String command = data[0];

			switch (command) {
			case "exchange":
				exchangeArray(numbers, Integer.parseInt(data[1]));
				break;
			case "max":
				getMaxElement(numbers, data[1]);
				break;
			case "min":
				getMinElementIndex(numbers, data[1]);
				break;
			case "first":
				firstCountElements(numbers, Integer.parseInt(data[1]), data[2]);
				break;
			case "last":
				lastCountElements(numbers, Integer.parseInt(data[1]), data[2]);
				break;
			}
		}

		System.out.println(Arrays.toString(numbers));
	}

	public static void exchangeArray(int[] numbers, int index) {
		if (index < 0 || index >= numbers.length) {
			System.out.println("Invalid index");
			return;
		}

		int[] exchangedArray = new int[numbers.length];

		int ind = 0;
		for (int i = index + 1; i < numbers.length; i++) {
			exchangedArray[ind++] = numbers[i];
		}

		for (int i = 0; i <= index; i++) {
			exchangedArray[ind++] = numbers[i];
		}

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = exchangedArray[i];
		}

	}

	private static void getMaxElement(int[] numbers, String oddOrEven) {
		int num = oddOrEven.equals("even") ? 0 : 1;

		int max = Integer.MIN_VALUE;
		int index = -1;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == num) {
				if (numbers[i] >= max) {
					max = numbers[i];
					index = i;
				}
			}
		}

		if (index == -1) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}

	public static void getMinElementIndex(int[] numbers, String oddOrEven) {
		int num = oddOrEven.equals("even") ? 0 : 1;

		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == num) {
				if (numbers[i] <= min) {
					min = numbers[i];
					index = i;
				}
			}
		}

		if (index == -1) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}

	private static int[] changeArraySize(int[] result) {
		int[] newArray = new int[result.length + 1];

		for (int i = 0; i < result.length; i++) {
			newArray[i] = result[i];
		}

		return newArray;
	}

	private static void fillElementsByCriteria(int[] numbers, int count, int num, int index, String criteria) {
		int[] result = new int[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == num) {
				if (index == result.length) {
					result = changeArraySize(result);
				}
				result[index++] = numbers[i];
			}
		}

		if (index == 0) {
			System.out.println("[]");
		} else {
			int minCount = Math.min(count, result.length);
			String output = "[";

			if (criteria.equals("first")) {
				for (int i = 0; i < minCount; i++) {
					if (i < minCount - 1) {
						output += result[i] + ", ";
					} else {
						output += result[i] + "]";
					}
				}
			} else {
				int countElements = 0;
				for (int i = 0; i < minCount; i++) {
					if (i < minCount - 1) {
						output += result[result.length - minCount + countElements++] + ", ";
					} else {
						output += result[result.length - minCount + countElements++] + "]";
					}
				}
			}

			System.out.println(output);
		}
	}

	private static boolean validateCount(int[] numbers, int count) {
		if (count < 0 || count > numbers.length) {
			System.out.println("Invalid count");
			return true;
		}
		return false;
	}

	private static void firstCountElements(int[] numbers, int count, String command) {
		if (validateCount(numbers, count))
			return;

		int num = command.equals("even") ? 0 : 1;

		int index = 0;
		fillElementsByCriteria(numbers, count, num, index, "first");
	}

	private static void lastCountElements(int[] numbers, int count, String command) {
		if (validateCount(numbers, count))
			return;

		int num = command.equals("even") ? 0 : 1;
		int index = 0;
		fillElementsByCriteria(numbers, count, num, index, "last");
	}
}
