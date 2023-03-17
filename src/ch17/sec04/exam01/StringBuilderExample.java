package ch17.sec04.exam01;

public class StringBuilderExample {
	public static void main(String[] args) {
		// StringBuilder 는 문자열 수정 가능
		// String 문자열 수정 불가
		
		String a = "java";
		String b= "html";
		
		String c = a + "hello";
		System.out.println(c);
		
		StringBuilder e = new StringBuilder("java");
		e.append("hello");
		System.out.println(e);
		StringBuilder f = new StringBuilder("html");
		f.append("helloo");
		System.out.println(f);
	}
}
