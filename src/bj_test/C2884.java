package bj_test;

import java.util.Scanner;

public class C2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M<45) {
			H--;
			if(H<0) {
				H = 23;
			}
			System.out.println(H + " " + (60-(45-M)));
		} else {
			System.out.println(H + " " + (M-45));
		}
	
	}
}
	
