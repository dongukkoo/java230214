package ch06.lecture.p03method;

public class C07Overloading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(23848L);
		o1.method1(55, 21);
		o1.method1("java", 9);
		
	}
}
