package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();

	// addPerson
	public void addPerson(Person p) throws DuplicateTelException {
		 for (int i = 0; i < list.size(); i++) {
			 Person per = (Person) list.get(i);
			 if (p.getTel().equals(per.getTel())) {
				 
				 throw new DuplicateTelException("������ ��ȣ�� �ֽ��ϴ�");		
				 }
		 	 }
		 list.add(p);
	}
	
	// printAll
	public void printAll() {

		System.out.println("��ü ���");
		for (int i = 0; i < list.size(); i++) {
			// ArrayList �� object Ÿ�� 
			// �ٿ� ĳ���� = Generic �ϸ� �ʿ����
			Person p = list.get(i); 
			System.out.println(p);
			System.out.println();
		}
	}

	// findPerson
	public Person findPerson(String tel) throws PersonNotFoundException {
		Person per = null;

		// list�� �ִ� ���� ��� ��ü�� Person Ÿ������ ĳ����
		// ���� ��� ��ü ��ȭ��ȣ�� ��� ����
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);

			if (p.getTel().startsWith(tel)) {
				per = p;
			}
		}
		
		if (per == null) {
			throw new PersonNotFoundException("ã�� �������� �����ϴ�");
		} else {
			return per;
		}
	}

	public void deletePerson(String tel) throws PersonNotFoundException {

		boolean flag = false;
		
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			if (p.getTel().startsWith(tel)) {
				list.remove(i);
				flag = true;
				break;
			}
		}
		
		if (flag = false) {
			throw new PersonNotFoundException("������ �������� �����ϴ�.");
		}
	}

	public void updatePerson(String tel, Person p) throws PersonNotFoundException {
		
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Person per = (Person) list.get(i);
			if (per.getTel().startsWith(tel)) {
				list.set(i, p);
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			throw new PersonNotFoundException("������ �������� �����ϴ�.");
		}
	}
}
