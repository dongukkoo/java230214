package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			
//		} catch(RuntimeException e) {
//			e.printStackTrace();
//			// 아래 catch 블럭의 exception보다
//			// 상위 타입의 exception catch 블럭을 먼저 작성할 수 없다.
//			
//		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
}