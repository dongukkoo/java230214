package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
		Horse h1 = (Horse) a1;
		
		Animal a2 = new Fish();
		
	}
}

class Fish extends Animal{
	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Horse extends Animal{
	@Override
	public void breath() {
		System.out.println("폐호흡한다");
	}
	
	public void run() {
		System.out.println("달립니다");
	}
}

class Animal{
	public void breath() {
		System.out.println("호흡한다.");
	}
}