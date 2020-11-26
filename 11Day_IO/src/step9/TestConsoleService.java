package step9;

import java.io.IOException;

public class TestConsoleService {

	public static void main(String[] args) {
		
		// 객체 생성은 try / catch 에서 하지 말자
		ConsoleService console = new ConsoleService();
		
		try {
			console.order("C:\\java-kosta\\iotest\\step3\\order.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
