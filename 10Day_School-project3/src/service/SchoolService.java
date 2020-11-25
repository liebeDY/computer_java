package service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import vo.Person;

public class SchoolService {

	private HashMap map = new HashMap();
	
	// addPerson : 동일한 전화번호가 존재할 때에는 추가 하지 않는다.
	public void addPerson(Person p) {

		if (map.containsKey(p.getTel())) {
			System.out.println("동일한 번호가 있습니다.");
		} else {
			map.put(p.getTel(), p);
		}
	}
	
	// printAll
	public void printAll() {
		System.out.println(map);
		Collection col = map.values();
		Iterator it2 = col.iterator();
		
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
	
	// findPerson
	public Person findPerson(String tel) {
		Person p = (Person) map.get(tel);
		return p;
	}
	
	// deletePerson
	public void deletePerson(String tel) {
		map.remove(tel);
	}
	
	// updatePerson
	public void updatePerson(String tel, Person p) {
		// 업데이트 할 번호가 map에 key로 존재한다면
		if (map.containsKey(tel)) {
			// 일단 삭제
			map.remove(tel);
			// 추가한다
			this.addPerson(p);
		} else {
			System.out.println("update 할 필요가 없음");
		}
	}
}
