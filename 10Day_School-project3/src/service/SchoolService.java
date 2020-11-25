package service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import vo.Person;

public class SchoolService {

	private HashMap map = new HashMap();
	
	// addPerson : ������ ��ȭ��ȣ�� ������ ������ �߰� ���� �ʴ´�.
	public void addPerson(Person p) {

		if (map.containsKey(p.getTel())) {
			System.out.println("������ ��ȣ�� �ֽ��ϴ�.");
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
		// ������Ʈ �� ��ȣ�� map�� key�� �����Ѵٸ�
		if (map.containsKey(tel)) {
			// �ϴ� ����
			map.remove(tel);
			// �߰��Ѵ�
			this.addPerson(p);
		} else {
			System.out.println("update �� �ʿ䰡 ����");
		}
	}
}
