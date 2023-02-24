package ch05.lecture.p08regex;

public class C05RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("b".matches("[abcdefghijklmnopqrstuvwxyz]"));
		
		System.out.println("g".matches("[a-z]"));
		System.out.println("x".matches("[a-z]"));
		
		System.out.println("Fz".matches("[A-Z][a-z]"));
		
		System.out.println("d".matches("[a-zA-Z]"));
		
		System.out.println("1".matches("[a-zA-Z]"));
		System.out.println("3".matches("[0-9]"));
		
		System.out.println("7".matches("[0-9a-zA-Z]"));
		
		System.out.println("010".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("abc".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("aZ3".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
	}
}
