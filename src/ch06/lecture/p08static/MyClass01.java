package ch06.lecture.p08static;

public class MyClass01 {
	// 필드
	String name;
	
	static String company;
	
	
	MyClass01(){
		name = "son";
	}
	
	// static block : 스태틱 필드 초기화
	static {
	company = "samsung";
}
}
