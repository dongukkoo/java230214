package ch15.lecture.p02collections;

import java.util.*;

public class C04Compare {
	public static void main(String[] args) {
		var list = new ArrayList<Person04>();
		list.add(new Person04("knag", "20230315"));
		list.add(new Person04("seo", "20221208"));
		list.add(new Person04("chae", "20120917"));
		list.add(new Person04("song", "20120318"));
		list.add(new Person04("jung", "20110515"));
		
		// 나이순 정렬(나이가 어릴수록 작은 index에)
		Collections.sort(list);
		System.out.println(list);
	}
}

class Person04 implements Comparable<Person04>{
	private String name;
	private String birth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public Person04(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "Person04 [name=" + name + ", birth=" + birth + "]";
	}
	
	@Override
	public int compareTo(Person04 o) {
		
		return o.birth.compareTo(this.birth);
	}
	
}














