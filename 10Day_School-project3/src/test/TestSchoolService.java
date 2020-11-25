package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
		
		SchoolService service = new SchoolService();
		
		Student s = new Student("001", "크리스탈", "판교", "12");
		service.addPerson(s);
		
		Teacher t = new Teacher("002", "황정민", "익산", "국어");
		service.addPerson(t);
		
		Employee e = new Employee("003", "박지성", "수원", "전산");
		service.addPerson(e);
		
		service.printAll();
		
		System.out.println();
		System.out.println();
		Person per = service.findPerson("001");
		if (per != null) {
			System.out.println(per);
		} else {
			System.out.println("찾는 사람이 없습니다.");
		}
		
		service.updatePerson("001", new Student("010", "보아", "종로", "123")	);
		service.printAll();
	}
}
