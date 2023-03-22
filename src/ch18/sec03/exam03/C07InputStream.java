package ch18.sec03.exam03;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "output/siu.png";
		String des = "output/siu_copy2.png";
		
		try(var is = new FileInputStream(src);
				var os = new FileOutputStream(des);){
					
			is.transferTo(os);
				} catch(Exception e) {
					e.printStackTrace();
				}
		System.out.println("복사 완료!");
	}
}
