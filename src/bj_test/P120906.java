package bj_test;

import java.util.*;

public class P120906 {
	public static void main(String[] args) {
		int n = 1234;
		int sum = 0;
		
		String str1 = Integer.toString(n);
		
		for(int i = 0; i<str1.length(); i++) {
			sum += Integer.parseInt(str1.substring(i,i+1));
		}
		System.out.println(sum);
	}
}
