package bj_test;

import java.util.Scanner;

public class C2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int a = num2 / 100;
		int b = (num2 % 100) / 10;
		int c = num2 % 10;
		
		int d = num1 * c;
		int e = num1 * b;
		int f = num1 * a;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(d + (e * 10) + (f * 100));
	}
}
