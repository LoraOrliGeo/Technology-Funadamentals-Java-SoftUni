package feb5_Arrays_Lab;

//import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {

		int[] numbers = { 1, 9, 4, 28, 17 };

//		Arrays.sort(numbers); // sort the array is increasing way
//		System.out.println(Arrays.toString(numbers)); // [... , ... , ... ]
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1 ; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}
}
