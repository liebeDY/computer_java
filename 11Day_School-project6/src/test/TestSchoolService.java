package test;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import service.SchoolService;
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
		
		service.printAll();
		System.out.println();
		try {
			Person p = service.findPerson("234");
			System.out.println("find: " + p);
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("삭제");
		
		try {
			service.deletePerson("2222");
			System.out.println("삭제되없습니다.");
			service.printAll();
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// 수정 메서드 확인
		System.out.println("수정");
		try {
			service.updatePerson("123ㅁㄴㅇ", new Student("123", "agoasdi", "asdgoi", "햄ㄴ야ㅓ"));
			System.out.println("수정되없습니다.");
			service.printAll();
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}	
}


