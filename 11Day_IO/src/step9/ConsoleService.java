package step9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleService {

	public void order(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		// ���� ���丮�� ������ �����
		file.getParentFile().mkdirs();
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		// true : ����
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw, true);
		
		while (true) {
			System.out.println("����޴��� �Է��ϼ��� : ");
			String str = br.readLine();
			
			if (str.equals("�ֹ�")) {
				System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
				break;
			}
			pw.println(str);
			System.out.println(str + " ok");
		}
		pw.close();
		br.close();
	}
}
