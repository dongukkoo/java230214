package lecture.p02type;

public class C15String {
	public static void main(String[] args) {
		// string과 기본 타입과의 연산
		// +외에 안됨
		
		String s1 = "3";
		String s2 = "4";
//		System.out.println(s1 * s2);  // 안됨
		
		// + : 연결연산
		int i3 = 3;
		String s3 = "4";
//		int r3 = i3 + s3;
		String r3 = i3 + s3;
		System.out.println(r3);
		System.out.println(3.14 + "hello");
		System.out.println(false + "hi");
		
		String r5 = "3" + 3 + 4;
		System.out.println(r5);
		
	}
}
