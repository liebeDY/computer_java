package step8;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException{
		
		// 
		File file = new File("C:\\java-kosta/fileTest.txt");
		
		if (!file.exists()) {
			System.out.println("������ �����մϴ�");
			file.createNewFile();
		}
		
	}

}
