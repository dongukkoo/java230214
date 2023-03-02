package bj_test;

public class P120825 {
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		
		for(int i = 0; i<my_string.length(); i++) {
			for(int j = i; j<n; ) {
			System.out.print(my_string.substring(j,j+1));
			
		}
	
	}
}
}
