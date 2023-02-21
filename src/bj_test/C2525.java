package bj_test;

import java.util.Scanner;

public class C2525 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int C = scanner.nextInt();
		
		int T = (H*60)+M+C;
		H = (T / 60)%24;
		if(H>=24) {
			H = 0;
		}
		M = T % 60;
		
		System.out.println(H + " " + M);
	}
}
