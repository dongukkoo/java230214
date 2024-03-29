package ch17.lecture.p03intermdeidate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("genesis", 7000),
				new Car("avante", 2500),
				new Car("tesla,", 5000),
				new Car("morning", 1500)
				);
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
				
	}
}

class Car implements Comparable<Car>{
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}
}