package ch05.lecture.p06for;

public class Ex07Enhanced {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = Integer.MIN_VALUE;

		for (int n : array) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);
		
		
	}
}
