package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import vo.Member;

public class BoardService {

	private ArrayList list = new ArrayList();
	
	public void loadData(String fileName) throws IOException, ClassNotFoundException {
		
		try {
			System.out.println("�����Ͱ� �ε��Ǿ����ϴ�.");
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			list = (ArrayList) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		}
	}
	
	public void saveData(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
//		ObjectOutputStream 
	}
	
	public void insertBoard(Member b) {
		boolean flag = false;
		
		for (int i = 0; i < list.size(); i++) {
			Member pro = (Member) list.get(i);
			if (b.equals(pro.getId())) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			list.add(b);
		} else {
			System.out.println("�̹� ��ϵ� ���̵� �Դϴ�.");
		}
	}
	
	public Member findBoard(String id) {
		Member pro = null;
		
		for (int i = 0; i < list.size(); i++) {
			Member pro1 = (Member) list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			}
		}
		return pro;
	}
}
