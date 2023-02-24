package bj_test;

import java.util.Arrays;

public class P120854 {
	public static void main(String[] args) {
		String[] arr1 = {"We", "are", "the", "world!"};
		int[] res = new int[arr1.length];
		
		for(int i = 0; i<arr1.length; i++) {
			res[i] = arr1[i].length();
		}
		System.out.println(Arrays.toString(res));
//		System.out.println(arr1.length);
	}
}
