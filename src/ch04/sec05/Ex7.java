package ch04.sec05;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int money = 0;
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");
			int num = scanner.nextInt();
			
			if(num == 1) {				
				System.out.println("예금액>");
				int in = scanner.nextInt();
				money += in;
				
			} else if (num == 2) {
				System.out.println("출금액>");
				int out = scanner.nextInt();
				money -= out;
			} else if (num == 3) {
				System.out.println("잔고");
				System.out.println(money);
			} else if (num == 4) {
				System.out.println("프로그램 종료");
			}
		}
	}
}
