package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
		MyClass02<? super String> o1 = new MyClass02<String>();
		o1.item = new String();  // String 또는 그 하위타입을 대입 가능
		
//		String s1 = o1.item; // String에 할당 불가
	}
}
class MyClass02<T>{
	public T item;
}