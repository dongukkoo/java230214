package ch13.lecture.p01generic;

public class Ex2 {

		public static void main(String[] args) {
		 Container<String> container1 = new Container<String>();
		 container1.set("홍길동");
		 String str = container1.get();
		 Container<Integer> container2 = new Container<Integer>();
		 container2.set(6);
		 int value = container2.get();
		}
	}

class Container<T>{
	private T item;

	public T get() {
		return item;
	}

	public void set(T item) {
		this.item = item;
	}
	
	
}