package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.*;

public class P08_CompanyUsers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		Map<String, List<String>> companyUser = new TreeMap<>();

		String line = "";

		while (!"End".equals(line = sc.nextLine())) {
			String input = line;
			String[] data = input.split(" -> ");
			String company = data[0];
			String userID = data[1];

			if (!companyUser.containsKey(company)) {
				companyUser.put(company, new ArrayList<>());
				companyUser.get(company).add(userID);
			} else {
				if (!companyUser.get(company).contains(userID)) {
					companyUser.get(company).add(userID);
				}
			}
		}

		companyUser.entrySet().stream().forEach(kvp -> {
			System.out.println(kvp.getKey());
			for (String id : kvp.getValue()) {
				System.out.println(String.format("-- %s", id));
			}
		});
		
	}
}
