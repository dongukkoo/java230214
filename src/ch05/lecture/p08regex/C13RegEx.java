package ch05.lecture.p08regex;

public class C13RegEx {
	public static void main(String[] args) {
		// 3개 이상 : {3,}
		
		String pattern = "[0-9]{2,}";
		
		System.out.println("09".matches(pattern));
		System.out.println("2a".matches(pattern));
	}
}
