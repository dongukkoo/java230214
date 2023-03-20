package ch17.lecture.p03intermdeidate;

import java.util.*;

public class C07Filter {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 9, -1, 0, 2, -3, -6, 7, 8);
		
		list.stream()
		.filter(s -> s>0)
		.forEach(System.out::println);
		
		System.out.println("--------짝수만-------");
		list.stream()
		.filter(s -> (s%2) ==0)
		.forEach(System.out::println);
	}
}
