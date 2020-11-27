package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class Input {
	
	// 프로그램 메뉴 돌리기
	public void startMenu() throws IOException, DuplicateTelException, PersonNotFoundException {
		
		SchoolService service = new SchoolService();
		
		InputStream is = System.in;
		
		InputStreamReader ir = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("학사관리 프로그램을 시작합니다.");
	
		while (true) {
			System.out.println("1.추가 2.삭제 3.검색 4.전체회원보기 5.종료");
			String str = br.readLine();
			
			if (str.equals("1")) {
				String tel, name, address = null;
				String type = "";
				Person p = null;
				
				while (true) {
					System.out.println("입력할 구성원의 종류를 선택하세요: 1.학생 2.선생님 3.직원");
					type = br.readLine();
					
					if (type.equals("1") || type.equals("2") || type.equals("3")) {
						break;
					} else {
						System.out.println("잘못된 입력값입니다.");
					}
				
				}
				System.out.println("1.전화번호를 입력하세요");
				tel = br.readLine();
				System.out.println("2.이름을 입력하세요");
				name = br.readLine();
				System.out.println("3.주소를 입력하세요");
				address = br.readLine();
				
				if (type.equals("1")) {
					System.out.println("4.학번을 입력하세요");
					String str4 = br.readLine();
					Student stu = new Student(tel, name, address, str4);
					p = stu;
				} else if (type.equals("2")) {
					System.out.println("4.담당과목을 입력하세요");
					String sub = br.readLine();
					Teacher t = new Teacher(tel, name, address, sub);
					p = t;
				} else if (type.equals("3")) {
					System.out.println("4.부서를 입력하세요");
					String dept = br.readLine();
					Employee e = new Employee(tel, name, address, dept);
					p = e;
				} else {
					System.out.println("잘못 입력하셨습니다");
				}
				
				// 마지막에 p로 받아서 addPer 메소드를 실행 시켜줘야한다
				// -> p는 객체만 만들어져 있는 상태
				try {
					service.addPerson(p);
					System.out.println(p + " 추가 되었습니다.");
				} catch (DuplicateTelException e) {
					e.getMessage();
				}
			}// if (1) 끝, 2.삭제	
			else if (str.equals("2")) {
				System.out.println();
				String tel2 = br.readLine();
				
				try {
					service.deletePerson(tel2);
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}// else if (2) 끝, 3.검색
			else if (str.equals("3")) {
				System.out.println("1.전화번호를 입력하세요");
				String tel1 = br.readLine();
				
				try {
					System.out.println(service.findPerson(tel1));
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}// else if (3) 끝, 4.전체회원 보기
			else if (str.equals("4")) {
				service.printAll();
			}// else if (4) 끝, 5.종료
			else if (str.equals("5")) {
				System.out.println("종료합니다");
				break;
			}
			else {
				System.out.println("입력된 값이 잘못되었습니다.");
			}
		}
	}
}

