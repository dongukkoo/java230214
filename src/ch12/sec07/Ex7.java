package ch12.sec07;

public class Ex7 {
	public static void main(String[] args) {
		
		int[] array = { 1, 5, 3, 8, 2 };
		
		int max = Integer.MIN_VALUE;
		
		for(int n : array) {
			max = Math.max(max, n);
		}
		System.out.println(max);
	}
}
