package step1;

import java.io.IOException;

public class TestFileUtil {

	public static void main(String[] args) {

		FileUtil fu = new FileUtil();
		
		String fileName = "C:\\java-kosta\\iotest\\step1\\data.txt";
		
		try {
			fu.writeData(fileName, "zzzzzzz");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fu.readFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
