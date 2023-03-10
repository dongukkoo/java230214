package ch13.lecture.p02wildcard;

public class C05WildCard {
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<Object>();
		addItem(o1);
	}
	public static void addItem(MyClass05<? super Number> param) {
		param.setItem(3);
		param.setItem(3.14);
		
	}
}

class MyClass05<T>{
	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}