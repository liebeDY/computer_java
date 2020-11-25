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
		 * �޴� �����
		 * 1.��� - 1.������ 2.�л� 3.������
		 * 2.�˻�	   
		 * 3.����
		 * 4.����
		 * 5.���
		 * 6.����
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
			System.out.println("1.���");
			System.out.println("2.�˻�");
			System.out.println("3.����");
			System.out.println("4.����");
			System.out.println("5.���");
			System.out.println("6.����");
			
			i = sc.nextInt();
			
			switch (i) {
			
			case 1: // ���
				System.out.println("tel �� �Է��ϼ���");
				tel = sc.next();
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				System.out.println("�ּҸ� �Է��ϼ���");
				address = sc.next();
				
				System.out.println("1.������");
				System.out.println("2.�л�");
				System.out.println("3.����");
				
				j = sc.nextInt();
				
				switch (j) {
				
				case 1: 
					System.out.println("�ҼӺμ��� �Է��ϼ���");
					dept = sc.next();
					service.addPerson(new Employee(tel, name, address, dept));
					break;
					
				case 2:
					System.out.println("stuId�� �Է��ϼ���");
					stuId = sc.next();
					service.addPerson(new Student(tel, name, address, stuId));
					break;
					
				case 3:
					System.out.println("������ �Է��ϼ���");
					subject = sc.next();
					service.addPerson(new Teacher(tel, name, address, subject));
					break;
				
				}
				break;
				
			case 2: // �˻�
				System.out.println("�˻��� ��ȣ�� �Է��ϼ���");
				tel = sc.next();
				Person per = service.findPerson(tel);
				System.out.println(per);
				break;
			
			case 3: // ����
				System.out.println("�˻��� ��ȣ�� �Է��ϼ���");
				tel = sc.next();
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				System.out.println("�ּҸ� �Է��ϼ���");
				address = sc.next();
				
				System.out.println("1.������");
				System.out.println("2.�л�");
				System.out.println("3.����");
				
				j = sc.nextInt();
				
				switch (j) {
				
				case 1:
					System.out.println("�μ��� �Է��ϼ���");
					dept = sc.next();
					service.updatePerson(tel, new Employee(tel, name, address, dept));
					break;
					
				case 2:
					System.out.println("stuId�� �Է��ϼ���");
					stuId = sc.next();
					service.updatePerson(tel, new Student(tel, name, address, stuId));
					break;
					
				case 3:
					System.out.println("������ �Է��ϼ���");
					subject = sc.next();
					service.updatePerson(tel, new Teacher(tel, name, address, subject));
					break;
				}
				break;
				
			case 4: // ����
				System.out.println("������ ��ȣ�� �Է��ϼ���");
				tel = sc.next();
				service.deletePerson(tel);
				System.out.println(tel + " �� �����Ǿ����ϴ�");
				break;
				
			case 5: // ���
				System.out.println("����մϴ�");
				service.printAll();
				break;
				
			case 6: // ����
				System.out.println("�����մϴ�.");
				flag = false;
			}
		}
	}
}
