package ch06.lecture.p10access;

import ch06.lecture.p10access.package1.*;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		
		System.out.println(o1.name);
		o1.method1();
		
//		System.out.println(o1.married);
//		o1.method3();
		
	}
}
