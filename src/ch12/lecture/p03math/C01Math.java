package ch12.lecture.p03math;

public class C01Math {
	public static void main(String[] args) {
		// Math class : 수학 연산에 필요한 메소드를 가진 클래스
		// 모두 static method
		
		// round : 반올림
		long l1 = Math.round(3.5);
		System.out.println(l1);
		
		long l2 = Math.round(3.4);
		System.out.println(l2);
		
		double d1 = Math.ceil(3.5);
		System.out.println(d1);
		double d2 = Math.ceil(3.1);
		System.out.println(d2);
		
		// floor : 버림
		double d3 = Math.floor(3.14);
		double d4 = Math.floor(3.9);
		System.out.println(d3);
		System.out.println(d4);
		
		// max : 둘중에 큰 값
		double d5 = Math.max(3.14, 3.5);
		long d6 = Math.max(300L, 500L);
		int d7 = Math.max(5, 3);
		
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		
		// min : 둘 중에 작은 값
		double d8 = Math.min(3.14, 3.5);
		
		
		
	}
}
















