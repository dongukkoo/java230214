package bj_test;

import java.util.Scanner;

public class C11021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int loop = scanner.nextInt();
		
		for(int i = 1; i<=loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.printf("Case #%d: %d", i, (a+b));
		}
		
		
		
		
		
	}
}
