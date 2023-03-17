package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

//		Map<String, List<Member>> groupingMap = list.stream()
//				.collect(Collectors.groupingBy(Member::getJob));
//		
//		List<Member> list1 = groupingMap.get("개발자");
//		System.out.println("[개발자]");
//		list1.stream()
//		.forEach(s -> System.out.println(s.toString()));
//		
//		List<Member> list2 = groupingMap.get("디자이너");
//		System.out.println("[디자이너]");
//		list2.stream()
//		.forEach(s -> System.out.println(s.toString()));
		Map<String, List<Member>> map = new HashMap<>();

		// code..
		for (Member member : list) {
			List<Member> val = map.get(member.getJob());

			if (val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}

		System.out.println("[개발자]");
		List<Member> dev = map.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}

		System.out.println();

		System.out.println("[디자이너]");
		List<Member> des = map.get("디자이너");
		for (Member d : des) {
			System.out.println(d);
		}

//		Map<String, List<Car>> r1 = list.stream()
//				.collect(Collectors.groupingBy(Car::getType));

	}
}
