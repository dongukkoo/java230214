package ch15.lecture.p01list;

import java.util.*;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> accounts = new ArrayList<>();

		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int menu = sc.nextInt();

			switch (menu) {

			case 1: {
				System.out.println("----------");
				System.out.println("계좌생성");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String account = sc.next();
				accounts.add(account);
				System.out.print("계좌주: ");
				String name = sc.next();
				accounts.add(name);
				System.out.print("초기입금액: ");
				int money = sc.nextInt();
				accounts.add(money);
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			break;

			case 2: {
				System.out.println("----------");
				System.out.println("계좌목록");
				System.out.println("----------");
				
				for(int i = 0; i<3; i++) {
					for(int j = 0; i<)
				System.out.print(accounts.get(i) + "      ");
				System.out.println();
				}
			}
			break;

			case 3: {

			}

			case 4: {

			}

			case 5: {
				run = false;
			}
				System.out.println("프로그램 종료");
			}

		}
	}
}
