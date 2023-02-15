package lecture.p02type;

public class C11Conversion {
	public static void main(String[] args) {
		int i1;  // 4bytes
		long l1; // 8bytes
		
		i1 = 100;
		l1 = i1;
		
		float f1; //4bytes
		double d1; //8bytes
		
		f1 = 3.14F;
		d1 = f1;
		
//		문자(char)에서 정수(int, long)으로 자동 형변환
		char c3 = '가';
		int i3 = c3;
		long l3 = c3;
		
		System.out.println(i3);
		System.out.println(l3);
		
	}
}
