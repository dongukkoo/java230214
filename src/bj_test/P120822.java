package bj_test;

public class P120822 {
	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
        for(int i = my_string.length(); i<=0; i--){
            answer += my_string.charAt(i);
        }
       System.out.println(answer);
       System.out.println(my_string.charAt(3));
       System.out.println(my_string.charAt(1)+my_string.charAt(4));
       System.out.println(my_string.substring(1,3));
       System.out.println(my_string.substring(1,2));
	}
}
