package ch17.lecture.p03intermdeidate;

import java.util.*;

public class C09Map {
	public static void main(String[] args) {
		List<String> list = List.of("java", "html", "css");
		
		list.stream()
		.map(s -> "hello " + s)
		.forEach(System.out::println);
	}
}
