package ch05.lecture.p07arrays;

import java.util.Arrays;

public class Ex7WithSort {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		System.out.println(array[(array.length)-1]);
//		System.out.println(Arrays.deepToString(array[0]));
		
//		System.out.println(Arrays.toString(array[(array.length)-1]));
	}
}
