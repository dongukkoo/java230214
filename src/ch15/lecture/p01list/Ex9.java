package ch15.lecture.p01list;

import java.util.*;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> scores = new ArrayList<>();
		boolean run = true;
		int student = 0;

		while (run) {

			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();

			switch (num) {
			case 1: {
				System.out.print("학생수> ");
				student = sc.nextInt();

			}
			break;
			case 2: {
				for (int i = 0; i <student; i++) {
					System.out.println("scores[" + i + "]>");
					scores.add(sc.nextInt());
				}

			}
			break;
			
			case 3: {
				for(int i = 0; i<student; i++) {
					System.out.println("scores[" + i + "]: " + scores.get(i));
				}
			}
			break;
			
			case 4: {
				int max = 0;
				double avg = 0;
				int sum = 0;
				
				for(int e : scores) {
					max = Math.max(max, e);
					sum += e;
					
				}
				avg = sum / student;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
			}
			break;
			
			case 5: {
				run = false;
			}
			System.out.println("프로그램 종료");
			}

		}
	}
}













