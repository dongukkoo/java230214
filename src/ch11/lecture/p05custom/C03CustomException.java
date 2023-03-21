package ch11.lecture.p05custom;

public class C03CustomException {
	public static void main(String[] args) {
		MyException01 e = new MyException01();
		MyException01 e1 = new MyException01("some message");
		
		System.out.println(e.getMessage());
		System.out.println(e1.getMessage());
	}
}
class MyException01 extends Exception{
	public MyException01(String message) {
		super(message);
	}
	
	public MyException01() {
		
	}
}