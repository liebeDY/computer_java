package service;

import java.util.ArrayList;

import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();
	
	// addPerson
	public void addPerson(Person p) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (p.equals(per.getTel())) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			list.add(p);
		} else {
			System.out.println("이미 등록된 번호 입니다.");
		}

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

		// list에 있는 개별 요소 객체를 Person 타입으로 캐스팅
		// 개별 요소 객체 전화번호를 얻기 위해
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
		// 업데이트가 뭘로 될지 모르므로 Person으로 정의
		for (int i = 0; i < list.size(); i++) {
			Person per = (Person) list.get(i);
			if (per.getTel().startsWith(tel)) {
				list.set(i, p);
				break;
			}
		}
	}

}
