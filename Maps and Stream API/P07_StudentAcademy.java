package ex1_MapsLambdaStreamAPI_13March2019;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P07_StudentAcademy {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		Map<String, List<Double>> academy = new LinkedHashMap<>();
		
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			Double grade = Double.parseDouble(sc.nextLine());
			
			if (!academy.containsKey(name)) {
				academy.put(name, new ArrayList<>());
				academy.get(name).add(grade);
			} else {
				academy.get(name).add(grade);
			}
		}
		
		Map<String, Double> averageGrades = new LinkedHashMap<>();
		
		for (String name : academy.keySet()) {
			double sum = 0;
			
			for (int i = 0; i < academy.get(name).size(); i++) {
				sum += academy.get(name).get(i);
			}
			
			double average = sum / academy.get(name).size();
			
			if (average >= 4.50) {
				averageGrades.put(name, average);
			}
		}
		
		averageGrades.entrySet().stream()
		.sorted(Map.Entry.<String, Double>comparingByValue().reversed())
		.forEach(e -> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue())));
	}
}
