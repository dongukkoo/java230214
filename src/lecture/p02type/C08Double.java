package lecture.p02type;
	
public class C08Double {
	public static void main(String[] args) {
		// 실수
		
		int i1 = 3;
//		i1 = 3.14;
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 3;
		
		float f1 = 3.14F; // F, f 끝문자로 float literal 표현
		f1 = 3;
		
		// 사용시 주의
		// 10진법 -> 2진법으로 바꿔서 저장
		// 
		double d2 = 0.1;
		double d3 = 0.2;
		
		double d4 = d2 + d3;
		System.out.println(d4);
		
	}
}
