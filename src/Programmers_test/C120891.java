package Programmers_test;

import java.util.Scanner;

public class C120891 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int clap = 0;
		int order = scanner.nextInt();				
		
		do {
			int right = order % 10;
			if(right == 3 || right == 6 || right == 9) {
				clap++;
			}
			order /= 10;
		} while (order != 0);
		System.out.println(clap);
	}
}
