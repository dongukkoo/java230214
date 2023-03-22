package ch18.sec03.exam02;

import java.io.*;
import java.nio.channels.*;

public class C05InputStream {
	public static void main(String[] args) {
		String src = "output/siu.png";
		String des = "output/siu_copy.png";
		
		try(
			var is = new FileInputStream(src);
			var os = new FileOutputStream(des);){
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사완료");
		
		
		
		
	}
}
