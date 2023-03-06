package ch07.lecture.p03cast;

import static org.hamcrest.CoreMatchers.*;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		System.out.println("실행 흐름 이어감...");
		
	}
	
	public static void method1(Animal a) {
		a.breath();
		
		// 만약 말 객체이면 실행
		if(a instanceof Horse) {
			Horse h = (Horse) a;
			h.run();
			
		}
		
	}
}
