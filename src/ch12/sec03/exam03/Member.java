package ch12.sec03.exam03;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
	 this.id = id;
	 this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
	//여기에 코드를 작성하세요.
}
