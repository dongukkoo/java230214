package ch05.lecture.p06for;

public class Ex8WithEnhancedFor {
	public static void main(String[] args) {
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0;
		int cnt = 0;

		for(int[] brray : array) {
			for(int n : brray) {
				sum += n;
				cnt++; 
			}
		}
		avg = (double) sum / cnt;
		System.out.println(sum);
		System.out.println(avg);
		
	}
}
