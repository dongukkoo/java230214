package ch16.lecture.p03reference;

public class C03MethodReference {
	public static void main(String[] args) {
		MyInterface04 o1 = a -> System.out.println(a);
		
		MyClass03 s1 = new MyClass03();
		MyInterface04 o2 = a -> s1.method(a);
		MyInterface04 o3 = s1::method;
		
		
	}
}

interface MyInterface04{
	void action(int a);
}

class MyClass03{
	void method1() {
		
	}
	
	void method2(int a, int b) {
		
	}
	
	void method(int a) {
		
	}
}