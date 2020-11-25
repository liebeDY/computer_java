package test;

import exception.DuplicateTelException;
import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
		
		SchoolService service = new SchoolService();
		
		try {
			service.addPerson(new Teacher("123", "ㅁㅁㅁ", "서울", "국어"));
			System.out.println("add ok");
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		}
		
		try {
			Student s = new Student("234", "asdf", "안양", "S123");
			service.addPerson(s);
			System.out.println("add ok");
		} catch (DuplicateTelException de ) {
			System.out.println(de.getMessage());
		}
		
//		Employee e = new Employee("346", "oqweiu", "구리", "전산");
//		service.addPerson(e);
		
		service.printAll();
		
		Person per = service.findPerson("123");
		if (per != null) {
			System.out.println(per);
		} else {
			System.out.println("찾는 번호가 없습니다.");
		}
		System.out.println("--------------");
		service.deletePerson("123");
		service.printAll();
		System.out.println("--------------");
		service.updatePerson("234", new Student("010","ㅁㄴㅇㄹ", "종로", "13"));
		service.printAll();
	}	
}


