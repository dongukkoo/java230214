package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		Optional<String> o1 = Optional.of("java");
		System.out.println(o1.isPresent());
		System.out.println(o1.isEmpty());
		String s1 = o1.get();
		System.out.println(s1);
		String s2 = o1.orElse("default");
		System.out.println(s2);
		
		System.out.println();
		Optional <String> o2 = Optional.ofNullable(null);
		System.out.println(o2.isPresent());
		System.out.println(o2.isEmpty());
		System.out.println(o1.get());
		
	}
}
