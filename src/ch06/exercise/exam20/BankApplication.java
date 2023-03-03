package ch06.exercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] ac1 = new Account[100];
		Account ac = new Account();
		boolean run = true;
		int cnt = 0;
		
		while(run) {
			
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.print("선택> " );		
		int num = sc.nextInt();
		
		
		switch(num) {
		case 1:
			System.out.println("-----------");
			System.out.println("계좌생성");
			System.out.println("-----------");
			System.out.print("계좌번호: ");
			String account = sc.next();
			System.out.print("계좌주: ");
			String name = sc.next();
			System.out.print("초기입금액: ");
			int fMoney = sc.nextInt();
			
			ac.setAccount(account);
			ac.setName(name);
			ac.setBalance(fMoney);
			ac1[cnt] = ac;
			cnt++;
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
			
			
		case 2:
			System.out.println("-----------");
			System.out.println("계좌목록");
			System.out.println("-----------");
			System.out.print(ac.getAccount());
			System.out.print("    " + ac.getName() + "    ");
			System.out.println(ac.getBalance());
			break;
			
		case 3:
			System.out.println("-----------");
			System.out.println("예금");
			System.out.println("-----------");
			System.out.print("계좌번호: ");
			ac.setAccount(sc.next());
			System.out.print("예금액: ");
			int money = sc.nextInt();
			ac.setBalance(ac.getBalance()+money);
			break;
			
		case 4:
			System.out.println("-----------");
			System.out.println("출금");
			System.out.println("-----------");
			System.out.println("계좌번호 :");
			ac.setAccount(sc.next());
			System.out.println("출금액: ");
			int outMoney = sc.nextInt();
			ac.setBalance(ac.getBalance()-outMoney);
			System.out.println("결과: 출금이 성공되었습니다.");
			break;
			
		case 5:
			System.out.println("프로그램 종료");
			
			run = false;
			
			
			}
	}
}
}
















