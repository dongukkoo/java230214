package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int myHour = 3;
		int min = 5;
		System.out.println(myHour + "시간" + min + "분");

		int totalMinute = (myHour * 60) + min;
		System.out.println("총" + totalMinute + "분");
	}
}
