package ch07.lecture.p04abstract;

// 추상클래스
// 이 클래스로 인스턴스를 만들 수 없음
public abstract class Animal {

	
	// 추상메소드
	// 몸통(body)없는 메소드
	// 추상메소드가 있는 클래스는 추상 클래스이어야 함
	// 상속받는 클래스에서 꼭 재정의 해야함
	public abstract void breath();
}