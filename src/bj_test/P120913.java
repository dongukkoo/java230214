package bj_test;

import java.util.Scanner;

public class P120913 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String my_str = sc.next();
		int n = sc.nextInt();
		String res;
		for(int i = 0; i<(my_str.length())/n; i+=n){
	        res = my_str.substring(i,(i+n));
	           System.out.println(res);
	        }
	}
}
