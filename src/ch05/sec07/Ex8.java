package ch05.sec07;

public class Ex8 {
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double cnt = 0;
		
		for(int i = 0; i<array.length; i++) {
			cnt += array[i].length;
			for(int j = 0; j<array[i].length; j++) {
				sum += array[i][j];
				
				
			}
			
		}
		System.out.println(sum);
		System.out.println(sum / cnt);
		
	}
}
