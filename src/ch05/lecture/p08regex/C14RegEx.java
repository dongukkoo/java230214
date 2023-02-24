package ch05.lecture.p08regex;

public class C14RegEx {
	public static void main(String[] args) {
		// + : 1개 이상
		
		String pattern1 = "[a-z]+";
		System.out.println("ekwj".matches(pattern1));
		System.out.println("A".matches(pattern1));
	}
}
