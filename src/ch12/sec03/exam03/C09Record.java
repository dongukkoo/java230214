package ch12.sec03.exam03;

public class C09Record {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09("son", 33);
		System.out.println(o1);
		System.out.println(o1.name());
		System.out.println(o1.age());
	}
}

record MyClass09(String name, int age) {
	
}