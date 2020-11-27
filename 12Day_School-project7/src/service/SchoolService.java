package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();
	
	// findIndex : 클래스 내부에서만 검색용으로 사용
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
	
	// addPerson 메서드 만들기
	public void addPerson(Person p) throws DuplicateTelException {
		int i = findIndex(p.getTel());
		// -1 : 동일한 번호가 없다면
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("동일한 번호가 존재합니다");
		}
	}
	
	// 전체 출력
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println(per);
		}
	}
	
	// 검색
	public Person findPerson(String tel) throws PersonNotFoundException {
		Person p = null;
		
		int i = findIndex(tel);
		
		if (i == -1) {
			throw new PersonNotFoundException("찾는 구성원이 없습니다.");
		}
		p = list.get(i);
		
		return p;
	}
	
	// 삭제
	public void deletePerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		
		if (i == -1) {
			throw new PersonNotFoundException("삭제할 구성원이 없습니다");
		}
		list.remove(i);
	}
}
