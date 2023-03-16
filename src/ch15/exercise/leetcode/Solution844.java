package ch15.exercise.leetcode;

import java.util.*;

public class Solution844 {
	public static void main(String[] args) {
		
	 
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
//		stack.push("java");
//		stack.push("html");
//		stack.push("css");
//		stack.push("spring");
//		
//		System.out.println(stack.size());
//		
//		stack.firstElement();
//		stack.
		
		String s = "ab#c";
		String t = "ad#c";
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			switch(c) {
			case '#' : {
				stack1.pop();
			}
			
			default:{
				stack1.push(c);
			}
			}
		}
		
		for(int i = 0; i<t.length(); i++) {
			char c = t.charAt(i);
			
			switch(c) {
			case '#' : {
				stack2.pop();
			}
			default : {
				stack2.push(c);
			}
			}
		}
		
		
	}
}






















