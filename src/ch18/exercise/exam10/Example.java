package ch18.exercise.exam10;

import java.io.*;

public class Example {
	public static void main(String[] args) throws Exception {
		String origin = "C:/Temp/dir1/photo1.png";
		String copy = "C:/Temp/dir1/photo2.png";
		
				
		File dir2 = new File("C:/Temp/dir2");
		File photo1 = new File("C:/Temp/dir1/photo1.png");

		if (dir2.exists() == false) {
			dir2.mkdirs();
		}
		if (photo1.exists() == false) {
			System.out.println("원본 파일이 존재하지 않습니다.");
		} else {
			InputStream is = new FileInputStream(origin);
			OutputStream os = new FileOutputStream(copy);
			
//			byte[] data = new byte[1024];
//			while(true) {
//				int num = is.read(data);
//				if(num == -1) break;
//				os.write(data, 0, num);
			
			is.transferTo(os);
			
			
			os.flush();
			os.close();
			is.close();
			System.out.println("복사가 성공되었습니다.");
		}

	}
}
