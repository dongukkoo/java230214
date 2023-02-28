package ch06.lecture.p03method;

public class C09VarArgs {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();
		o1.method1();
		o1.method1(0);
		o1.method1(0, 0);
		
		o1.method2(new int[] {});
		o1.method2(new int[] {3});
		o1.method2(new int[] {9,10});
		o1.method2(new int[] {100, 200, 300});
				
		o1.method3(5);
		o1.method3(100,200);
		
		
	}
}
