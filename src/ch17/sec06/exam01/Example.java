package ch17.sec06.exam01;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));
		
		System.out.println("---------for 사용--------");
		double sum = 0;
		for(Member member : list) {
			sum += member.getAge();
		}
		double avg1 = sum / list.size();
		System.out.println(avg1);
		System.out.println("---------for 사용--------");
		double avg = list.stream()
				.mapToDouble(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("평균 나이: " + avg);
	}
}
