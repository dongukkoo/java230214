package ch17.lecture.p02terminal;

import java.util.*;

public class C02Find {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 1, 9, 0, 2, 4);
		
		Optional<Integer> v1 = list.stream().findFirst();
		
		System.out.println(v1.get());
		
		
	}
}
