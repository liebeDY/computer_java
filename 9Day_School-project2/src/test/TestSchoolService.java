package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
		
		SchoolService service = new SchoolService();
		
		service.addPerson(new Teacher("123", "������", "����", "����"));
		
		Student s = new Student("234", "asdf", "�Ⱦ�", "S123");
		service.addPerson(s);
		
		Employee e = new Employee("346", "oqweiu", "����", "����");
		service.addPerson(e);
		
		service.printAll();
		
		Person per = service.findPerson("123");
		if (per != null) {
			System.out.println(per);
		} else {
			System.out.println("ã�� ��ȣ�� �����ϴ�.");
		}
		System.out.println("--------------");
		service.deletePerson("123");
		service.printAll();
		System.out.println("--------------");
		service.updatePerson("234", new Student("010","��������", "����", "13"));
		service.printAll();
	}	
}


