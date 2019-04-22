package feb20_Lists_Exercises;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_ChangeList {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		List<String> elements = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());

		String input = "";

//		List<String> output = new ArrayList<>();
		
		while (!"end".equals(input = sc.nextLine())) {
			String[] data = input.split(" ");
			String command = data[0];

			switch (command) {
			case "Delete":
				elements = elements.stream().filter(e -> !e.equals(data[1])).collect(Collectors.toList());
				
//				for (int i = 0; i < elements.size(); i++) {
//					if (!elements.get(i).equals(data[1])) {
//						output.add(elements.get(i));
//					}
//				}
				break;
			case "Insert":
				String element = data[1];
				int position = Integer.parseInt(data[2]);
				if (position >= 0 && position < elements.size()) {
					elements.add(position, element);
				}
				break;
			}
		}
		System.out.println(elements.toString().replaceAll("\\[|,|\\]", ""));
	}
}
