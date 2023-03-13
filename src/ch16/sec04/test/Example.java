package ch16.sec04.test;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
//avg() 메소드 작성
//	public static double avg(Function<Student> function) {
//		int sum = 0;
//		for(Student student : students) {
//		 sum += function.apply(student);
//		}
//		double avg = (double) sum / students.length;
//		return avg;
//		}
	public static double avg(Function function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student);
		}
		double avg = sum / students.length;
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> ((Student) s).getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(s -> ((Student) s).getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
