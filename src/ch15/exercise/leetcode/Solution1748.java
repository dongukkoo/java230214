package ch15.exercise.leetcode;

import java.util.*;

public class Solution1748 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 2};
	
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int n : arr1) {
			map.putIfAbsent(n, 0);
			int oldValue = map.get(n);
			map.replace(n, oldValue + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(map.keySet());
			System.out.println("--11--------------------");
			System.out.println(entry.getValue());
			System.out.println("---22-------------------");

			System.out.println(entry.getKey());
			System.out.println("---33-------------------");

		}
		
		
//		int sum = 0;
//		
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			int value = entry.getValue();
//			
//			if (value == 1) {
//				sum += entry.getKey();
//			}
//		}
//		
//		System.out.println(sum);
		
	}
}




