package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
		
		SchoolService service = new SchoolService();
		
		Student s = new Student("001", "ũ����Ż", "�Ǳ�", "12");
		service.addPerson(s);
		
		Teacher t = new Teacher("002", "Ȳ����", "�ͻ�", "����");
		service.addPerson(t);
		
		Employee e = new Employee("003", "������", "����", "����");
		service.addPerson(e);
		
		service.printAll();
		
		System.out.println();
		System.out.println();
		Person per = service.findPerson("001");
		if (per != null) {
			System.out.println(per);
		} else {
			System.out.println("ã�� ����� �����ϴ�.");
		}
		
		service.updatePerson("001", new Student("010", "����", "����", "123")	);
		service.printAll();
	}
}
