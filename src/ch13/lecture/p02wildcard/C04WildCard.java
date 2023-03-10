package ch13.lecture.p02wildcard;

public class C04WildCard {
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		
	}
	public static void printItem(MyClass04<? extends Number> param) {
		// in
		Number num = param.getItem();
		
	}
}
class MyClass04<T>{
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}