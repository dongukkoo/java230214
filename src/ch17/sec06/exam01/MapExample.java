package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));

		studentList.stream()
				.mapToInt(s -> s.getScore())
				.forEach(score -> System.out.println(score));

		int sum = studentList.stream()
				.map(Student::getScore)
				.reduce(Integer::sum)
				.get();
		
		System.out.println(sum);
		
		int max = studentList.stream()
				.mapToInt(Student::getScore)
				.max()
				.getAsInt();
		System.out.println(max);
		
		int min = studentList.stream()
				.mapToInt(Student::getScore)
				.min()
				.getAsInt();
		System.out.println(min);

		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		System.out.println(avg);

		System.out.println("----------통계----------");
		
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		
		System.out.println("최대: " + summary.getMax());
		System.out.println("최소: " + summary.getMin());
		System.out.println("합: " + summary.getSum());
		System.out.println("평균: " + summary.getAverage());
	}
}








