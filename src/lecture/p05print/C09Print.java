package lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		System.out.printf("%d%n", 300);
		System.out.printf("%5d%n", 300);
		System.out.printf("%6d%n", 300);
		System.out.printf("%6d%n", 30030030);
		
		System.out.printf("%6s%n", "hi");
		
		int age = 33;
		String name = "son";
		
		System.out.printf("나이는 %2$3d이고, 이름은 %1$10s입니다.%n", name, age);
	}
}
