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
			service.addPerson(new Teacher("123", "������", "����", "����"));
			System.out.println("add ok");
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		}
		
		
		try {
			Student s = new Student("234", "asdf", "�Ⱦ�", "S123");
			service.addPerson(s);
			System.out.println("add ok");
		} catch (DuplicateTelException de ) {
			System.out.println(de.getMessage());
		}
		
//		Employee e = new Employee("346", "oqweiu", "����", "����");
//		service.addPerson(e);
		
		service.printAll();
		
		try {
			Person per = service.findPerson("123");
			System.out.println("find: " + per);			
		} catch (PersonNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------");
		
		try {
			service.deletePerson("123");
			System.out.println("������ �Ǿ����ϴ�.");
			service.printAll();
			
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------");
		
		try {
			service.updatePerson("234", new Student("010","��������", "����", "13"));
			
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		service.printAll();
	}	
}


