package step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {

	public static void main(String[] args) {

		// 객체를 직렬화 하여
		// "C:\\java-kosta\\iotest\\person.obj"
		// 객체를 저장
		
		Person p = new Person("백박사", "mc", "성남시 중원구");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java-kosta\\iotest\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("객체 직렬화하여 파일에 저장");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
}
