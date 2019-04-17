package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> miner = new LinkedHashMap<>();
		
		while (true) {
			String resource = sc.nextLine();
			
			if (resource.equals("stop")) {
				break;
			}
			
			int quanity = Integer.parseInt(sc.nextLine());
			
			if (!miner.containsKey(resource)) {
				miner.put(resource, quanity);
			} else {
				miner.put(resource, miner.get(resource) + quanity);
			}
		}
		
		for (Map.Entry<String, Integer> kvp : miner.entrySet()) {
			System.out.println(kvp.getKey() + " -> " + kvp.getValue());
		}
	}
}
