package step1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id = null;
		String name = null;
		String tel = null;
		String addr = null;
		boolean flag = true;
		int i = 0;
		
		while(flag) {
			
			System.out.println("1.���");
			System.out.println("2.��ü���");
			System.out.println("3.����");
			i = sc.nextInt();
			
			switch(i) {
				
			case 1 :
				System.out.println("���̵� �Է��ϼ��� : ");
				id = sc.next();
				System.out.println("�̸��� �Է��ϼ��� : ");
				name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
				tel = sc.next();
				System.out.println("�ּҸ� �Է��ϼ��� : ");
				addr = sc.next();
				System.out.println();
				break;
			case 2 :
				System.out.println("���̵� : " + id);
				System.out.println("�̸� : " + name);
				System.out.println("��ȭ��ȣ : " + tel);
				System.out.println("�ּ� : " + addr);
				System.out.println();
				break;
				
			case 3 :
				flag = false;
				break;
				
			}
		}
		
		
	}

}
