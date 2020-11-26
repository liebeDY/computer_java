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
		
		service.printAll();
		System.out.println();
		try {
			Person p = service.findPerson("234");
			System.out.println("find: " + p);
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("����");
		
		try {
			service.deletePerson("2222");
			System.out.println("�����Ǿ����ϴ�.");
			service.printAll();
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// ���� �޼��� Ȯ��
		System.out.println("����");
		try {
			service.updatePerson("123������", new Student("123", "agoasdi", "asdgoi", "�ܤ��ߤ�"));
			System.out.println("�����Ǿ����ϴ�.");
			service.printAll();
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}	
}


