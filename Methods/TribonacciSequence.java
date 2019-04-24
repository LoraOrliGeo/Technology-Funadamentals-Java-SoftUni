package feb13_Methods_Functions_MoreExercises;

import java.util.Scanner;

public class TribonacciSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		//https://pastebin.com/W9zYwQUF

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		String print = "";

		int n0 = 0, n1 = 1, n2 = 1;
		print += n1 + " " + n2 + " ";
		
		if (num == 1) {
			System.out.println(1);
			return;
		}

		for (int i = 2; i < num; i++) {
			int n3 = n0 + n1 + n2;
			print += n3 + " ";
			n0 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		System.out.println(print);

	}
}
