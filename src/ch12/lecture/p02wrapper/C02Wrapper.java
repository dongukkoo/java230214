package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		Integer o1 = i1; // (auto boxing)
		Integer o3 = Integer.valueOf(i1); // boxing
		
		Number o4 = i1;  // auto boxing, 자동형변환 같이 일어남.
		Object o5 = i1; // auto boxing, 자동형변환 같이 일어남.
	}
}
