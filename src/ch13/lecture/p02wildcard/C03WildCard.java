package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		
	}
}

class MyClass03<T>{
	public T item;
}