package ch14.lecture.p02thread;

public class C01Sleep {
	public static void main(String[] args) {
		System.out.println("메인쓰레드 시작");
		
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인쓰레드 종료");
	}
}
