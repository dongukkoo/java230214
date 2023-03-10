package ch13.sec05;

public class GnenericExample {
	public static void main(String[] args) {
		
		Course.registerCourse1(new Applicant<Person>(new Person)));
		Course.registerCourse2(new Applicant<Worker>(new Worker));
	}
	
}
