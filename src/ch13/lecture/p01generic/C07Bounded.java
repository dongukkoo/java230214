package ch13.lecture.p01generic;

import java.util.*;

public class C07Bounded {
	public static void main(String[] args) {
		MyClass07<String> o1 = new MyClass07<>();
		o1.setItem("java");
		o1.printItem();
		
	}
}

class MyClass07<T>{
	private T item;
	
	public void printItem() {
		// Object의 메소드 안전하게 실행 가능
		// 왜냐하면 Object는 모든 클래스의 상위 클래스이니까
		String str = item.toString();
		int hashCode = item.hashCode();
		boolean equals = item.equals(null);
		
		
		
	}
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}