package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C07CopyMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {
				{5, 7, 9, 10},
				{3, 2, 1, 0}
		};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.deepToString(arr1));
		
		System.out.println("for loop로 toString");
		
	}
}
