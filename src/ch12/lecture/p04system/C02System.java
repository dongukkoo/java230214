package ch12.lecture.p04system;

public class C02System {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long startNano = System.nanoTime();
		
		for(int i = 0; i<10_0000_0000L; i++) {
			int r = 3*5;
		}
		
		long end = System.currentTimeMillis();
		long endNano = System.nanoTime();
		System.out.println(end-start);
		System.out.println(endNano-startNano);
	}
}
