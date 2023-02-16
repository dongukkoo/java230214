package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		// 실수를 0으로 나누면 무한대 (Infinity)
		double a = 0.0;
		double b = 3.0;
		
		double c = b / a;
		System.out.println(c);
		
		double d = -3.0;
		
		double e = d / a;
		System.out.println(e);
		
		// 실수를 0으로 나눈 나머지 : NaN (not a number)
		double f = 3.0 % 0.0;
		System.out.println(f);
		
		double g = f + 1.0;
		System.out.println(g);
		
		System.out.println(c+e);
		
		// 무한대인지 확인
		boolean isinfinite1 = Double.isInfinite(c);
		System.out.println(isinfinite1);
		
		// NaN인지 확인
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1);
			
	}
}
