package lecture.p04scanner;

import java.util.Scanner;

public class C08Scanner {
	public static void main(String[] args) {
		
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";
		Scanner scanner = new Scanner(input);
		
		
		int loop = scanner.nextInt();
		
		for(int i = 0; i<loop; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int res = num1 + num2;
			System.out.println(res);
		}
		
	}
}
