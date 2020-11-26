package step3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\java-kosta/a.txt");
		
		BufferedInputStream bin = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\java-kosta/b.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fos);
		
		int buf;
		
		while ((buf = bin.read()) != -1) {
			System.out.print((char) buf);
			bout.write(buf);
		}
		// 항상 닫아줘야 한다
		bin.close();
		bout.close();
		
		FileReader fr = new FileReader("C:\\java-kosta/c.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("C:\\java-kosta/d.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("\n문자단위(2바이트)로 읽었을 떄");
		
		while ((buf = br.read()) != -1) {
			System.out.print((char) buf);
			bw.write(buf);
		}
		
		br.close();
		bw.close();
	}
}
