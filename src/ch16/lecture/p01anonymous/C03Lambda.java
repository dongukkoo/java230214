package ch16.lecture.p01anonymous;

public class C03Lambda {
	public static void main(String[] args) {
		
		MyInterface03 o1 = (int a) -> {
			System.out.println("람다로 재정의");
			System.out.println("받은 값: " + a);
		};
		o1.method(9);
		o1.method(3);
		
		MyInterface03 o3 = (a) -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값: " + a);
		};
		o3.method(20);
		
		MyInterface03 o4 = a -> {
			System.out.println("괄호 생략");
			System.out.println("받은 값: " + a);
		};
		o4.method(51);
		
		MyInterface03 o5 = x -> {
			System.out.println("파라미터명 정의");
			System.out.println("받은 값: " + x);
		};
		o5.method(33);
	}
}
interface MyInterface03{
	void method(int a);
	}












