package lab1_MapsLambdaStreamAPI_12March2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P2_WordSynonyms {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, List<String>> wordsBySynonyms = new LinkedHashMap<>();
		
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < n; i++) {
			String word = reader.readLine();
			String synonym = reader.readLine();
			
			wordsBySynonyms.putIfAbsent(word, new ArrayList<>());
			wordsBySynonyms.get(word).add(synonym);
		}
		
		String pattern = "%s - %s%n";
		for (Map.Entry<String, List<String>> kvp : wordsBySynonyms.entrySet()) {
			System.out.printf(String.format(pattern, kvp.getKey(), kvp.getValue().toString().replaceAll("\\[|\\]", "")));
		}
	}
}
