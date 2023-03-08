package ch08.sec03;

public interface MyInterface05 {

	static void method1() {
		common();
		System.out.println("method1 code....");
	}
	
	static void method2() {
		common();
		System.out.println("method2 code.....");
	}
	
	private static void common() {
		System.out.println("공통된코드");
	}
}
