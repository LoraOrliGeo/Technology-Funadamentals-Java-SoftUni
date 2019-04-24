package feb5_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int[] firstArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] secondArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int sum = 0;

		// int maxLength = Math.max(firstArray.length, secondArray.length);

		boolean isIdentical = true;
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] != secondArray[i]) {
				isIdentical = false;
				System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
				break;
			} else {
				sum += firstArray[i];
			}
		}

		if (isIdentical) {
			System.out.printf("Arrays are identical. Sum: %d%n",sum);
		}

	}
}
