package ch05.lecture.p08regex;

public class C09RegEx {
	public static void main(String[] args) {
		// character class
		//negation (not)
		
		// 숫자가 아니면서 일치
		System.out.println("0".matches("[^0-9]"));
		
	}
}
