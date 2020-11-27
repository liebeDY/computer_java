package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
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
	
	// 
	
	
}
