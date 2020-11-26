package step5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReaderWriter {

	public static void main(String[] args) throws IOException{
		
		int ch;
		
		System.out.println("한글을 입력하고 엔터를 누르세요");
		
		// 1바이트씩 글자를 읽는다 -> 한글 깨진다
		while ((ch = System.in.read()) != '\n') {
			System.out.print((char) ch);
		}
		System.out.println();
		
		System.out.println("한글을 입력하고 엔터를 누르세요");
		
		// 한글 안 깨짐
		InputStreamReader in = new InputStreamReader(System.in);
		
		while ((ch = in.read()) != '\n') {
			System.out.print((char) ch);
		}
		
		
		FileOutputStream fos = new FileOutputStream("C:\\java-kosta/files/e.txt");
		
		OutputStreamWriter out = new OutputStreamWriter(fos);
		
		String str = "OutputStreamWriter 테스팅 메시지";
		out.write(str);
		
		in.close();
		out.close();
	}
}
