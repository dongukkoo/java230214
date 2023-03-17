package ch17.lecture.p01stream;

import java.util.*;
import java.util.stream.*;

public class C04Stream {
	public static void main(String[] args) {
		Collection<Integer> set = Set.of(9, 2, 1, 1, 2, 9, 0, 3);
		
		Stream<Integer> stream1 = set.stream();
		long count = stream1.count();
		System.out.println(count);
	}
}
