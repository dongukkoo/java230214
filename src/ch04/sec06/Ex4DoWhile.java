package ch04.sec06;

public class Ex4DoWhile {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		do {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			
			System.out.printf("(%d, %d)%n", num1, num2);
//			System.out.printf("(%d, %d)%n", num1, num2);
//			System.out.print(num1);
//			System.out.print(num2);
		} while ((num1 + num2) != 5);
	}
}
