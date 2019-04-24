package feb13_Methods_Functions_MoreExercises;

import java.util.Scanner;

public class SignOfIntegerNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		printSign(Integer.parseInt(sc.nextLine()));
	}
	
	public static void printSign(int number) {
		if(number > 0) {
			System.out.printf("The number %d is positive.", number);
		} else if (number < 0){
			System.out.printf("The number %d is negative.", number);
		} else {
			System.out.printf("The number %d is zero.", number);
		}
	}
}
