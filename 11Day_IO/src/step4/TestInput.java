package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("C:\\java-kosta\\output4.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			// readLine : ù ������ �д´�
			String str = br.readLine();
			
			// str�� null�� �ƴ� ������ ��� �ݺ�
			while (str != null) {
				System.out.println(str);
				// ���� ������ str�� ���
				str = br.readLine();
			}
			// ���� ���� �ݾ��ֱ�
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
