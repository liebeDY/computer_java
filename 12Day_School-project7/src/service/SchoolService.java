package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();
	
	// findIndex : Ŭ���� ���ο����� �˻������� ���
	private int findIndex(String tel) {
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (per.getTel().equals(tel)) {
				index = 1;
				break;
			}
		}
		return index;
	}
	
	// addPerson �޼��� �����
	public void addPerson(Person p) throws DuplicateTelException {
		int i = findIndex(p.getTel());
		// -1 : ������ ��ȣ�� ���ٸ�
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("������ ��ȣ�� �����մϴ�");
		}
	}
	
	// 
	
	
}
