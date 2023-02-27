package ch05.lecture.p08regex;

public class C18Regex {
	public static void main(String[] args) {
		// 특수기호
		
		String pattern1 = "[0-9]";
		String pattern2 = "\\d";
		
		System.out.println("0".matches(pattern1));
		System.out.println("0".matches(pattern2));
		
		System.out.println("19900112".matches("[0-9]{8}"));
		System.out.println("19900112".matches("\\d{8}"));
		
		// 전화번호
		//010 으로 시작, -하나 있거나 없거나, 숫자 4개, -하나 있거나 없거나, 숫자 4개
		
		String num1 = "01099999999";
		String num2 = "010-00000000";
		String num3 = "010-7777-7777";
		
		String pattern3 = "010-?\\d{4}-?\\d{4}";
		
		System.out.println(num1.matches(pattern3));
		System.out.println(num2.matches(pattern3));
		System.out.println(num3.matches(pattern3));
	}
}
