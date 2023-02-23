package ch05.sec07;

import java.util.Scanner;

public class EX9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------");
		System.err.println("선택> ");
		
		int[] scores = null;				
		int num = sc.nextInt();
		
		switch(num) {
		case 1 -> {
			System.out.println("학생수> ");
			int student = sc.nextInt();
			scores = new int[student];
		}
			
		case 2 -> {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
					
				}
			}
		
		case 3 -> {
			for(int i = 0; i<scores.length; i++) {
				System.out.println("scores[" + i + "]: " + scores[i]);
			}
		}
		
		case 4 -> {
			int max = 0;
			for(int i = 0; i<scores.length; i++) {
				
			}
			
			System.out.println("최고 점수: ");
			System.out.println("평균 점수: ");
		}
		
		
		
		}
		
	}
}







