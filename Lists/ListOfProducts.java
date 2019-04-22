package feb19_Lists_Lab;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		List<String> products = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			products.add(sc.nextLine());
		}

		products = products.stream().sorted().collect(Collectors.toList());

		for (int i = 0; i < products.size(); i++) {
			System.out.println(i + 1 + "." + products.get(i));
		}

	}
}
