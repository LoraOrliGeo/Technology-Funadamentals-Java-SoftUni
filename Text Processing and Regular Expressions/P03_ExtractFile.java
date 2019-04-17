package ex2_TextProcessingAndRegEx_20March2019;

import java.util.Scanner;

public class P03_ExtractFile {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		String[] data = sc.nextLine().split("\\\\");
		String lastElement = data[data.length - 1];
		
		String fileName = lastElement.substring(0, lastElement.lastIndexOf('.'));
		String extension = lastElement.substring(lastElement.lastIndexOf('.') + 1);
		
		System.out.println(String.format("File name: %s%nFile extension: %s", fileName, extension));
	}
}
