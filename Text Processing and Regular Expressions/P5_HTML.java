package ex2_TextProcessingAndRegEx_MoreEx;

import java.util.Scanner;

public class P5_HTML {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String title = sc.nextLine();
		String content = sc.nextLine();
		
		String comment = "";
		
		System.out.println(String.format("<h1>\n    %s\n</h1>", title));
		System.out.println(String.format("<article>\n    %s\n</article>", content));
		
		while (!"end of comments".equals(comment = sc.nextLine())) {
			System.out.println(String.format("<div>\n    %s\n</div>", comment));
		}
	}
}
