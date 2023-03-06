package ch07.sec07.exam2;

import java.util.*;

public class C04Polymorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Scanner sc1 = new Scanner("");
		
		method1(s1);
		method1(sc1);
		
	}
	
	public static void method1(Object o) {
		String s = o.toString();
		
		System.out.println(s);
	}
}
