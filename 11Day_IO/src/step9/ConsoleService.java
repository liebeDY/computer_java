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
		
		// 상위 디렉토리에 폴더를 만든다
		file.getParentFile().mkdirs();
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		// true : 누적
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw, true);
		
		while (true) {
			System.out.println("저녁메뉴를 입력하세요 : ");
			String str = br.readLine();
			
			if (str.equals("주문")) {
				System.out.println("주문이 완료되었습니다.");
				break;
			}
			pw.println(str);
			System.out.println(str + " ok");
		}
		pw.close();
		br.close();
	}
}
