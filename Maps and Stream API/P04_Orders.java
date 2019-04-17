package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_Orders {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		Map<String, Double> nameNprice = new LinkedHashMap<>();
		Map<String, Integer> nameNquantity = new LinkedHashMap<>();
		
		while (true) {
			String[] data = sc.nextLine().split("\\s+");
			String order = data[0];
			
			if (order.equals("buy")) {
				break;
			}
			
			double price = Double.parseDouble(data[1]);
			int quantity = Integer.parseInt(data[2]);
			
			if (!nameNprice.containsKey(order) && !nameNquantity.containsKey(order)) {
				nameNquantity.put(order, quantity);
				nameNprice.put(order, price * nameNquantity.get(order));
			} else {
				nameNquantity.put(order, nameNquantity.get(order) + quantity);
				nameNprice.put(order, price * nameNquantity.get(order));
			}
		}
		
		for (Map.Entry<String, Double> kvp : nameNprice.entrySet()) {
			System.out.println(String.format("%s -> %.2f", kvp.getKey(), kvp.getValue()));
		}
	}
}
