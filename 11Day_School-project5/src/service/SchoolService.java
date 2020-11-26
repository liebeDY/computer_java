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
				 
				 throw new DuplicateTelException("동일한 번호가 있습니다");		
				 }
		 	 }
		 list.add(p);
	}
	
	// printAll
	public void printAll() {

		System.out.println("전체 출력");
		for (int i = 0; i < list.size(); i++) {
			// ArrayList 는 object 타입 
			// 다운 캐스팅 = Generic 하면 필요없음
			Person p = list.get(i); 
			System.out.println(p);
			System.out.println();
		}
	}

	// findPerson
	public Person findPerson(String tel) throws PersonNotFoundException {
		Person per = null;

		// list에 있는 개별 요소 객체를 Person 타입으로 캐스팅
		// 개별 요소 객체 전화번호를 얻기 위해
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);

			if (p.getTel().startsWith(tel)) {
				per = p;
			}
		}
		
		if (per == null) {
			throw new PersonNotFoundException("찾는 구성원이 없습니다");
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
			throw new PersonNotFoundException("삭제할 구성원이 없습니다.");
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
			throw new PersonNotFoundException("수정할 구성원이 없습니다.");
		}
	}
}
