package ch08.lecture.p04default_method;

public interface MyInterface01 {
	void method1();
	
	// 접근제한자 생략하면 public
	default void method2() {
		System.out.println("interface의 default method");
		System.out.println("body가 있는 메소드");
	}
}
