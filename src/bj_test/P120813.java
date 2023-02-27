package bj_test;

import java.util.Arrays;
import java.util.Scanner;

public class P120813 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1;
		int k = 0;
				
		
		if((n%2)==0) {
			arr1 = new int[n/2];
		} else {
			arr1 = new int[(n/2)+1];
		}
		
		for(int i = 0; i<=n; i++) {
			if((i%2)==1) {
				arr1[k] = i;
				k++;
			}
			
//			arr1[i] = i;
//			if((n%2) != 0){
//				System.out.println(arr1[i]);
//			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
