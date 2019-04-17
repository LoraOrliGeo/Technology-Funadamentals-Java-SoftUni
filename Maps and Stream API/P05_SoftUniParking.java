package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_SoftUniParking {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		Map<String, String> users = new LinkedHashMap<>();

		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split("\\s+");
			String option = line[0];
			String name = line[1];

			switch (option) {
			case "register":
				String lisence = line[2];

				if (users.containsKey(name)) {
					System.out.println(String.format("ERROR: already registered with plate number %s", lisence));
				} else {
					users.put(name, lisence);
					System.out.println(String.format("%s registered %s successfully", name, lisence));
				}
				break;
			case "unregister":
				if (!users.containsKey(name)) {
					System.out.printf("ERROR: user %s not found%n", name);
				} else {
					System.out.printf("%s unregistered successfully%n", name);
					users.remove(name);
				}
				break;
			}
		}

//		for (Map.Entry<String, String> kvp : users.entrySet()) {
//			System.out.println(String.format("%s => %s", kvp.getKey(), kvp.getValue()));
//		}

		users.entrySet().stream()
				.forEach(kvp -> System.out.println(String.format("%s => %s", kvp.getKey(), kvp.getValue())));

//		// sort and print users alphabetically
//		users.entrySet().stream().sorted((k1, k2) -> k1.getKey().compareTo(k2.getKey()))
//				.forEach(kvp -> System.out.println(String.format("%s => %s", kvp.getKey(), kvp.getValue())));
	}
}
