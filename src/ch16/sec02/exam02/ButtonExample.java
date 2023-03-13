package ch16.sec02.exam02;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		btnCancel.click();
	}
}