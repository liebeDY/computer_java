package test;

import java.util.Scanner;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class homework {

	public static void main(String[] args) {

		/*
		 * 메뉴 만들기
		 * 1.등록 - 1.교직원 2.학생 3.선생님
		 * 2.검색	   
		 * 3.수정
		 * 4.삭제
		 * 5.출력
		 * 6.종료
		 * */ 
		  
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		String address;
		String dept;
		String subject;
		String stuId;
		
		int i,j = 0;
		
		SchoolService service = new SchoolService();
		
		boolean flag = true;
		
		
		while (flag) {
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.출력");
			System.out.println("6.종료");
			
			i = sc.nextInt();
			
			switch (i) {
			
			case 1: // 등록
				System.out.println("tel 을 입력하세요");
				tel = sc.next();
				System.out.println("이름을 입력하세요");
				name = sc.next();
				System.out.println("주소를 입력하세요");
				address = sc.next();
				
				System.out.println("1.교직원");
				System.out.println("2.학생");
				System.out.println("3.선생");
				
				j = sc.nextInt();
				
				switch (j) {
				
				case 1: 
					System.out.println("소속부서를 입력하세요");
					dept = sc.next();
					service.addPerson(new Employee(tel, name, address, dept));
					break;
					
				case 2:
					System.out.println("stuId를 입력하세요");
					stuId = sc.next();
					service.addPerson(new Student(tel, name, address, stuId));
					break;
					
				case 3:
					System.out.println("과목을 입력하세요");
					subject = sc.next();
					service.addPerson(new Teacher(tel, name, address, subject));
					break;
				
				}
				break;
				
			case 2: // 검색
				System.out.println("검색할 번호를 입력하세요");
				tel = sc.next();
				Person per = service.findPerson(tel);
				System.out.println(per);
				break;
			
			case 3: // 수정
				System.out.println("검색할 번호를 입력하세요");
				tel = sc.next();
				System.out.println("이름을 입력하세요");
				name = sc.next();
				System.out.println("주소를 입력하세요");
				address = sc.next();
				
				System.out.println("1.교직원");
				System.out.println("2.학생");
				System.out.println("3.선생");
				
				j = sc.nextInt();
				
				switch (j) {
				
				case 1:
					System.out.println("부서를 입력하세요");
					dept = sc.next();
					service.updatePerson(tel, new Employee(tel, name, address, dept));
					break;
					
				case 2:
					System.out.println("stuId를 입력하세요");
					stuId = sc.next();
					service.updatePerson(tel, new Student(tel, name, address, stuId));
					break;
					
				case 3:
					System.out.println("과목을 입력하세요");
					subject = sc.next();
					service.updatePerson(tel, new Teacher(tel, name, address, subject));
					break;
				}
				break;
				
			case 4: // 삭제
				System.out.println("삭제할 번호를 입력하세요");
				tel = sc.next();
				service.deletePerson(tel);
				System.out.println(tel + " 이 삭제되었습니다");
				break;
				
			case 5: // 출력
				System.out.println("출력합니다");
				service.printAll();
				break;
				
			case 6: // 종료
				System.out.println("종료합니다.");
				flag = false;
			}
		}
	}
}
