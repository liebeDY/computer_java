package step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {

	public static void main(String[] args) {

		// ��ü�� ����ȭ �Ͽ�
		// "C:\\java-kosta\\iotest\\person.obj"
		// ��ü�� ����
		
		Person p = new Person("��ڻ�", "mc", "������ �߿���");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java-kosta\\iotest\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("��ü ����ȭ�Ͽ� ���Ͽ� ����");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
}
