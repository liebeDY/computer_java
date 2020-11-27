package step1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtil {

	public void writeData(String fileName, String content) throws IOException {
		
		// 파일을 file로 읽어 들인다
		File file = new File(fileName);
		
		// "C:\\java-kosta-\\iotest\\step1\\data.txt"
		
		// 상위 디렉토리로 생성
		File dir = new File(file.getParent());
		dir.mkdirs();
		
		FileWriter fw = new FileWriter(file, true);
		
		// 메모장에 실제로 기록
		PrintWriter pw = new PrintWriter(fw, true);
		pw.println(content);
		pw.close();
	}
	
	public void readFile(String fileName) throws IOException {
		
		FileReader fr = new FileReader(fileName);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
	}
}
