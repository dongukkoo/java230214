package ch11.lecture.p02try_catch;

public class C03TryCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			System.out.println("try block continue...");
			
		} catch(ArithmeticException e) {
//			System.out.println("예외발생!!!!");
			e.printStackTrace();
		}
		System.out.println("program continue...");
	}
}
