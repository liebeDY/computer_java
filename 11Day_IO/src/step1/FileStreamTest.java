package step1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\java-kosta/a.txt");
		FileOutputStream fos = new FileOutputStream("C:\\java-kosta/b.txt");
		
		int buf;
		
		while ((buf = fis.read()) != -1) {
			System.out.print((char) buf);
			fos.write(buf);
		}
		
		fis.close();
		fos.close();
	}
}
