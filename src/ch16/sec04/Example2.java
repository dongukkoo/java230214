package ch16.sec04;

public class Example2 {
	private static int[] scores = { 10, 50, 3 };
	public static int maxOrMin(Operator operator) {
	 int result = scores[0];
	 for(int score : scores) {
	 result = operator.apply(result, score);
	 }
	 return result;
}
	public static void main(String[] args) {
//		int max = maxOrMin((x, y) -> Math.max(x, y));
		int max = maxOrMin(Math::max);
				 System.out.println("최대값: " + max);
				 
				 //최소값 얻기
//		int min = maxOrMin((x, y) -> Math.min(x, y));
		int min = maxOrMin(Math::min);
				 System.out.println("최소값: " + min);
	}
}
