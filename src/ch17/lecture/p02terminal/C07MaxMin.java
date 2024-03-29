package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);

//		Integer max = list.stream()
//				.max((x, y) -> x - y)
//				.get();
		
		Integer max = list.stream()
				.max(Integer::compare)
				.get();

		System.out.println(max);

		Integer min = list.stream()
				.min(Integer::compareTo)
				.get();
		
		System.out.println(min);
	}
}
