package step3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step2.Person;

public class TestObjectInput {

	public static void main(String[] args) {

		try {
			// 파일에 연결되는 8bit 입력 스트림 생성
			FileInputStream fis = new FileInputStream("C:\\java-kosta\\iotest\\person.obj");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person p = (Person) ois.readObject();
			
			System.out.println("역직렬화 하여 객체 복원 " + p);
			
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
