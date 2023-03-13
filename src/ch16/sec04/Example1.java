package ch16.sec04;

public class Example1 {
	public static double calc(Function fun) {
		 double x = 10;
		 double y = 4;
		 return fun.apply(x, y);
		}
		public static void main(String[] args) {
		 double result = calc( (x, y) -> (x / y) );
		 System.out.println("result: " + result);
		}
}
@FunctionalInterface
interface Function{
	double apply(double x, double y);
}