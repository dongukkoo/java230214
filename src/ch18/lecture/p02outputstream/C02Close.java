package ch18.lecture.p02outputstream;

import java.io.*;

import org.junit.jupiter.api.condition.*;

public class C02Close {
	public static void main(String[] args) {
		// finally 블럭에서도 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;
		
		// 스트림 열고
		try {
			
			OutputStream os = new FileOutputStream("output/output.txt");
			
			// 어떤 작업
			os.write(1);
			
			os.flush();
			// 꼭 해야함
			os.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			if(os != null) {
				os.close();
			}
		}
	}
}
