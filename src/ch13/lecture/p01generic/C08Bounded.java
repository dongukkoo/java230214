package ch13.lecture.p01generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.hadnleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		
	}
}
// bounded type parameter
class MyClass08<T extends Number>{
	private T item;
	
	public MyClass08(T item) {
		this.item = item;
	}
	
	public void hadnleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);
		
		// item이 Number또는 하위타입이므로
		int i = item.intValue();
		double d = item.doubleValue();
		
	}
	
	
}