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
	
	// ���α׷� �޴� ������
	public void startMenu() throws IOException, DuplicateTelException, PersonNotFoundException {
		
		SchoolService service = new SchoolService();
		
		InputStream is = System.in;
		
		InputStreamReader ir = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("�л���� ���α׷��� �����մϴ�.");
	
		while (true) {
			System.out.println("1.�߰� 2.���� 3.�˻� 4.��üȸ������ 5.����");
			String str = br.readLine();
			
			if (str.equals("1")) {
				String tel, name, address = null;
				String type = "";
				Person p = null;
				
				while (true) {
					System.out.println("�Է��� �������� ������ �����ϼ���: 1.�л� 2.������ 3.����");
					type = br.readLine();
					
					if (type.equals("1") || type.equals("2") || type.equals("3")) {
						break;
					} else {
						System.out.println("�߸��� �Է°��Դϴ�.");
					}
				
				}
				System.out.println("1.��ȭ��ȣ�� �Է��ϼ���");
				tel = br.readLine();
				System.out.println("2.�̸��� �Է��ϼ���");
				name = br.readLine();
				System.out.println("3.�ּҸ� �Է��ϼ���");
				address = br.readLine();
				
				if (type.equals("1")) {
					System.out.println("4.�й��� �Է��ϼ���");
					String str4 = br.readLine();
					Student stu = new Student(tel, name, address, str4);
					p = stu;
				} else if (type.equals("2")) {
					System.out.println("4.�������� �Է��ϼ���");
					String sub = br.readLine();
					Teacher t = new Teacher(tel, name, address, sub);
					p = t;
				} else if (type.equals("3")) {
					System.out.println("4.�μ��� �Է��ϼ���");
					String dept = br.readLine();
					Employee e = new Employee(tel, name, address, dept);
					p = e;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
				}
				
				// �������� p�� �޾Ƽ� addPer �޼ҵ带 ���� ��������Ѵ�
				// -> p�� ��ü�� ������� �ִ� ����
				try {
					service.addPerson(p);
					System.out.println(p + " �߰� �Ǿ����ϴ�.");
				} catch (DuplicateTelException e) {
					e.getMessage();
				}
			}// if (1) ��, 2.����	
			else if (str.equals("2")) {
				System.out.println();
				String tel2 = br.readLine();
				
				try {
					service.deletePerson(tel2);
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}// else if (2) ��, 3.�˻�
			else if (str.equals("3")) {
				System.out.println("1.��ȭ��ȣ�� �Է��ϼ���");
				String tel1 = br.readLine();
				
				try {
					System.out.println(service.findPerson(tel1));
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}// else if (3) ��, 4.��üȸ�� ����
			else if (str.equals("4")) {
				service.printAll();
			}// else if (4) ��, 5.����
			else if (str.equals("5")) {
				System.out.println("�����մϴ�");
				break;
			}
			else {
				System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�.");
			}
		}
	}
}

