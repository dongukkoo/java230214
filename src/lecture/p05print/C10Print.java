package lecture.p05print;

public class C10Print {
	public static void main(String[] args) {
		System.out.printf("%d%n", 33);
		System.out.printf("%-10d%n", 33);
		
		// 0 : 0으로 채움 (수)
		System.out.printf("%d%n", 99);
		System.out.printf("%5d%n", 99);
		System.out.printf("%05d%n", 99);
		
		System.out.printf("%010f%n", 3.14);
		
		// precision : 소수점 이하 자릿수
		System.out.printf("%10.3f%n", 3.14);
	}
}
