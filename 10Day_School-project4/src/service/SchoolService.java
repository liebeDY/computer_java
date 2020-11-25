package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();
	
	// addPerson
	public void addPerson(Person p) throws DuplicateTelException {
		// Exception 처리
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			if (p.equals(per.getTel())) {
				throw new DuplicateTelException("동일한 번호가 존재하여 추가할 수 없습니다.");
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
