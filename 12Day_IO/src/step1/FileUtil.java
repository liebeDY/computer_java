package step1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtil {

	public void writeData(String fileName, String content) throws IOException {
		
		// ������ file�� �о� ���δ�
		File file = new File(fileName);
		
		// "C:\\java-kosta-\\iotest\\step1\\data.txt"
		
		// ���� ���丮�� ����
		File dir = new File(file.getParent());
		dir.mkdirs();
		
		FileWriter fw = new FileWriter(file, true);
		
		// �޸��忡 ������ ���
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
