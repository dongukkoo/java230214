package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton o1 = new Singleton();
		
		
		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		
		if(o1 == o2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
