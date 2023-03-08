package ch08.lecture.p05cast;

public class C05Instanceof {
	public static void main(String[] args) {
//		method("java");
//		method(new StringBuilder("java"));
		method(new StringBuffer(""));
	}
	
	public static void method(CharSequence c) {
		System.out.println(c instanceof String);
		System.out.println(c instanceof Object);
		System.out.println(c instanceof CharSequence);
		System.out.println(c instanceof Comparable);
	}
}
