package ch05.lecture.p08regex;

public class C11RegEx {
	public static void main(String[] args) {
		// 010으로 시작하고, -기호, 숫자4개, -기호, 숫자 4개
		
		System.out.println("010-9999-7777".matches("010-[0-9]{4}-[0-9]{4}"));
		System.out.println("010-2903-4932".matches("010-[0-9]{4}-[0-9]{4}"));
		System.out.println("010-8238482".matches("010-[0-9]{4}-[0-9]{4}"));
		System.out.println("010-234-8832".matches("010-[0-9]{4}-[0-9]{4}"));
	}
}
