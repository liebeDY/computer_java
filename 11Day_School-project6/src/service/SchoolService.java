package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<Person>();

	// 검색 메서드
	public int findIndex(String tel) {
		// 데이터가 없다는 뜻 -1
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

	// add 메서드
	public void addPerson(Person p) throws DuplicateTelException {
		
		int i = findIndex(p.getTel());
		
		// 데이터가 없을 때 : -1
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("이미 등록된 번호입니다.");
		}
	}
	
	public void printAll() {
		System.out.println("전체 출력");
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println(per);
		}
	}
	
	public Person findPerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		Person p = null;
		// -1이라면 -> 데이터가 없다
		if (i == -1) {
			throw new PersonNotFoundException("찾는 구성원이 없습니다.");
		}			
		// else 는 필요 없다 -> Exception 이면 바로 코드 끝
		p = list.get(i);
		
		return p;
	}
	
	// 삭제
	public void deletePerson(String tel) throws PersonNotFoundException{
		int i = findIndex(tel);
			
		if (i == -1) {
			throw new PersonNotFoundException("찾는 구성원이 없습니다.");
		}
		list.remove(i);
	}
	
	// 수정
	public void updatePerson(String tel, Person p) throws PersonNotFoundException{
		int i = findIndex(tel);
		if (i == -1) {
			throw new PersonNotFoundException("찾는 구성원이 없습니다.");
		}
//		내가 한거
//		list.remove(i);
//		list.add(i, p);
		
		// set을 사용하면 삭제할 필요 없다.
		list.set(i, p);
	}
	
}	