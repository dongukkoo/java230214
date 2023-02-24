package ch05.lecture.p06for;

public class Ex07WithIndexOf {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		int max = 0;
		int indexOfMax = 0;
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
				indexOfMax = i;
			}
		}
		System.out.println(max);
		System.out.println(indexOfMax);
	}
}
