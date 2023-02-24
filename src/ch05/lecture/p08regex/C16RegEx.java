package ch05.lecture.p08regex;

public class C16RegEx {
	public static void main(String[] args) {
		// {0,1}
		// ? : 0개 또는 1개
		
		String pattern = "[0-9]?";
		System.out.println("0".matches(pattern));
		System.out.println("c".matches(pattern));
		System.out.println("000".matches(pattern));
	}
}
