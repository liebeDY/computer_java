package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();
	
	// addPerson
	public void addPerson(Person p) throws DuplicateTelException {
		// Exception ó��
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (p.equals(per.getTel())) {
				throw new DuplicateTelException("������ ��ȣ�� �����Ͽ� �߰��� �� �����ϴ�.");
			}
		}
	
		list.add(p);
	}

	// printAll
	public void printAll() {

		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			System.out.println(p);
			System.out.println();
		}
	}

	// findPerson
	public Person findPerson(String tel) {
		Person per = null;

		// list�� �ִ� ���� ��� ��ü�� Person Ÿ������ ĳ����
		// ���� ��� ��ü ��ȭ��ȣ�� ��� ����
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);

			if (p.getTel().startsWith(tel)) {
				per = p;
				break;
			}
		}
		return per;
	}

	public void deletePerson(String tel) {

		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			if (p.getTel().startsWith(tel)) {
				list.remove(i);
				break;
			}
		}
	}

	public void updatePerson(String tel, Person p) {
		// ������Ʈ�� ���� ���� �𸣹Ƿ� Person���� ����
		for (int i = 0; i < list.size(); i++) {
			Person per = (Person) list.get(i);
			if (per.getTel().startsWith(tel)) {
				list.set(i, p);
				break;
			}
		}
	}

}
