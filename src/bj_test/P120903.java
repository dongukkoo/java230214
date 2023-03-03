package bj_test;

public class P120903 {
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		
		s1.equals(s2);
		
		System.out.println(s1.equals(s2[1]));
	}
}
