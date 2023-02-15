package lecture.p04scanner;

import java.util.Scanner;

public class C05Scanner {
	public static void main(String[] args) {
		// 백준 1000번
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int res = num1 + num2;
		
		System.out.println(res);
	}
}
