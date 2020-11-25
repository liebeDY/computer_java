package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private int menu;
	private boolean flag = true;
	private String menuStr = "1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.�������ʱ�ȭ 7.����";
	
	// menuProcess
	public void menuProcess(ArrayList<Member> data) {
		int idx = 0;
		
		while (flag) {
			System.out.println(menuStr);
			menu = sc.nextInt();
			
			switch (menu) {
			
			case 1:
				data.add(infoInput());
				break;
				
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
				
			case 3:
				editMember(data);
				break;
			}
		}
	}
	
	// ���
	public Member infoInput() {
		System.out.println("�̸�: ");
		String name = sc.next();
		System.out.println("��ȭ��ȣ: ");
		String tel = sc.next();
		sc.nextLine();
		System.out.println("�ּ�: ");
		String address = sc.nextLine();
		
		return new Member(name, tel, address);
	}
	
	// �˻�
	public int search(ArrayList<Member> data) {
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		
		for (int i = 0; i < data.size(); i++) {
			if (name.equals(data.get(i).getName())) {
				return i;
			}
		}
		return 0;
	}
	
	// ���
	public void printMember(Member m) {
		System.out.println(m);
	}
	
	// ����
	public void editMember(ArrayList<Member> data) {
		int idx = search(data);
		System.out.println("�� ��ȭ��ȣ: ");
		String tel = sc.next();
		sc.nextLine();
		System.out.println("�� �ּ�: ");
		String address = sc.next();
		
		data.set(idx, new Member(data.get(idx).getName(), tel, address));
	}
	
}
