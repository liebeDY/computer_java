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
			
			// readLine : 첫 라인을 읽는다
			String str = br.readLine();
			
			// str이 null이 아닐 때까지 계속 반복
			while (str != null) {
				System.out.println(str);
				// 다음 라인을 str에 담기
				str = br.readLine();
			}
			// 잊지 말고 닫아주기
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
