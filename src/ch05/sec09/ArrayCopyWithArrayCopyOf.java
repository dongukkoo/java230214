package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyWithArrayCopyOf {
	public static void main(String[] args) {
		String[] arr1 = {"java", "array", "copy"};
		
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
