package step9;

import java.io.IOException;

public class TestConsoleService {

	public static void main(String[] args) {
		
		// ��ü ������ try / catch ���� ���� ����
		ConsoleService console = new ConsoleService();
		
		try {
			console.order("C:\\java-kosta\\iotest\\step3\\order.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
