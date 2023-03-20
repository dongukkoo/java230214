package ch17.lecture.p03intermdeidate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(0);
		
		Stream<Integer> stream1 = list.stream();
		
		Stream<Integer> stream2 = stream1.distinct();
		
		long count1 = stream2.count();
		System.out.println(count1);
	}
}
