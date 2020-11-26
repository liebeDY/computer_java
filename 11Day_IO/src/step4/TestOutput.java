package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {

	public static void main(String[] args) {

		try {
			
			// 파일안에 데이터 기록, true -> 데이터 누적, false -> 한번만 기록
			FileWriter fw = new FileWriter("C:\\java-kosta\\output4.txt", true);
			// true -> 데이터를 연속적으로 출력
			PrintWriter pw = new PrintWriter(fw, true);
			pw.println("크리스탈");
			System.out.println("데이터를 기록");
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
