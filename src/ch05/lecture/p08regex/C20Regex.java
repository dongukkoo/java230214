package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20Regex {
	public static void main(String[] args) {
		String str1 = "   al ad al   aksdd a  qwkd   alkwmd     adw";
		String str2 = str1.replaceAll("\\s", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "qwkjdnqwd    ,  qwjnd,qkjwd  ,  jkqwdnkwqd";
		String[] str4 = str3.split("\s*,\s*");
		
		System.out.println(Arrays.toString(str4));
	}
}
