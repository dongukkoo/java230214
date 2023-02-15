package lecture.p04scanner;

import java.util.Scanner;

public class C07Scanner {
	public static void main(String[] args) {
		// 백준 2525
		// String input = """
		// 14 30
		// 20""";

		// String input = """
		// 17 40
		// 80""";

		String input = """
				13 20
				25""";

		Scanner scanner = new Scanner(input);
		
		int currentHour = scanner.nextInt();
		int currentMin = scanner.nextInt();
		int pastMin = scanner.nextInt();
		
		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " + currentMin);

	}
}
