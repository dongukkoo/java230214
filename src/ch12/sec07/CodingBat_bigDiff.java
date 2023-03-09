package ch12.sec07;

public class CodingBat_bigDiff {
	public static void main(String[] args) {
		int[] array = {7, 2, 10, 9};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
//		int min;
		
		for(int n : array) {
			max = Math.max(max, n);
//			min = Math.min(max, n);
//			max = Math.min(max, n);
		}
		for(int n : array) {
			min = Math.min(min, n);
	}
		System.out.println(max-min);
		
}
}
