package ch04.sec04;

public class Ex5 {
	public static void main(String[] args) {
		outerLoop : for(int x = 1; x<=10; x++) {
			for(int y = 1; y<=10; y++) {
				int res = 4*x + 5*y;
				if(res==60) {
					System.out.println("(" + x + "," + y + ")");
					break outerLoop;
//					하나만 찾아라 할때 -->> 지정한곳에 break;
				}
//				System.out.println("(" + (15-1.25*y) + "," + (12-0.8*x) + ")");
			}
		}
	}
}
