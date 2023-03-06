package ch07.sec07.exam2;

import java.util.*;

public class C03Polymorphism {
	public static void main(String[] args) {
		String s1 = "Hello";
		Object o1 = s1;
		
		Object o2 = "java";
		char c1 = s1.charAt(0);
		
		Scanner sc1 = new Scanner("");
		Object o3 = sc1;
		
		Object o4 = new Scanner("");
		sc1.nextLine();
//		o3.nextLine();
	}
}
