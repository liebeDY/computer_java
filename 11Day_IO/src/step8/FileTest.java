package step8;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException{
		
		// 
		File file = new File("C:\\java-kosta/fileTest.txt");
		
		if (!file.exists()) {
			System.out.println("파일을 생성합니다");
			file.createNewFile();
		}
		
	}

}
