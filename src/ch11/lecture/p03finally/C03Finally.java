package ch11.lecture.p03finally;

public class C03Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			if(a) {
				return;
			}
		// catch block 없어도 finally 쓸 수 있음.
		} finally {
			System.out.println("finally block...");
		}
	}
}
