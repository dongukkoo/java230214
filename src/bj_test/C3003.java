package bj_test;

import java.util.Scanner;

public class C3003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int king = scanner.nextInt();
		int queen = scanner.nextInt();
		int rook = scanner.nextInt();
		int bishop = scanner.nextInt();
		int knight = scanner.nextInt();
		int pawn = scanner.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", (1-king), (1-queen), (2-rook), (2-bishop), (2-knight), (8-pawn));
		
	}
}
