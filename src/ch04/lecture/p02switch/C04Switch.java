package ch04.lecture.p02switch;

public class C04Switch {
	public static void main(String[] args) {
		
		int val = 3;
		switch (val) {
		case 1:
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
			break;
		default:
			System.out.println("default code");
			
		}
		// switch labeled statement
		// break 없이 코드 블럭 작성 가능
		
		switch(val) {
		case 1 -> {
			System.out.println("code 1");
		}
		case 2-> {
			System.out.println("code 2");
		}
		case 3, 4 -> {
			System.out.println("code 3, 4");
		}
		default -> {
			System.out.println("default code");
		}
		}
	}
}
