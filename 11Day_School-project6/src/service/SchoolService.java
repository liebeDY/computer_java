package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();

	// �˻� �޼���
	public int findIndex(String tel) {
		// �����Ͱ� ���ٴ� �� -1
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			
			if (per.getTel().equals(tel)) {
				index = i;
				break;
			}
		}
		return index;
	}

	// add �޼���
	public void addPerson(Person p) throws DuplicateTelException {
		
		int i = findIndex(p.getTel());
		
		// �����Ͱ� ���� �� : -1
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("�̹� ��ϵ� ��ȣ�Դϴ�.");
		}
	}
	
	public void printAll() {
		System.out.println("��ü ���");
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println(per);
		}
	}
	
	public Person findPerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		Person p = null;
		// -1�̶�� -> �����Ͱ� ����
		if (i == -1) {
			throw new PersonNotFoundException("ã�� �������� �����ϴ�.");
		}			
		// else �� �ʿ� ���� -> Exception �̸� �ٷ� �ڵ� ��
		p = list.get(i);
		
		return p;
	}
	
	// ����
	public void deletePerson(String tel) throws PersonNotFoundException{
		int i = findIndex(tel);
			
		if (i == -1) {
			throw new PersonNotFoundException("ã�� �������� �����ϴ�.");
		}
		list.remove(i);
	}
	
	// ����
	public void updatePerson(String tel, Person p) throws PersonNotFoundException{
		int i = findIndex(tel);
		if (i == -1) {
			throw new PersonNotFoundException("ã�� �������� �����ϴ�.");
		}
//		���� �Ѱ�
//		list.remove(i);
//		list.add(i, p);
		
		// set�� ����ϸ� ������ �ʿ� ����.
		list.set(i, p);
	}
	
}	