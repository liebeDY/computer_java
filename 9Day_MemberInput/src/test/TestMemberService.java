package test;

import java.util.Scanner;

import service.MemberService;
import vo.MemberVo;

public class TestMemberService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		String name;
		String tel;
		String addr;

		boolean flag = true;

		int i = 0;

		MemberService service = new MemberService();

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
				System.out.println("Id�� �Է��ϼ���");
				id = sc.next();
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				tel = sc.next();
				System.out.println("�ּҸ� �Է��ϼ���");
				addr = sc.next();
				service.addMemberVO(new MemberVo(id, name, tel, addr));
				break;

			case 2: // �˻�
				System.out.println("�˻��� Id�� �Է��ϼ���");
				id = sc.next();
				MemberVo vo = service.findMemberVO(id);

				if (vo != null) {
					System.out.println(vo);
				} else {
					System.out.println("Id�� �����ϴ�.");
				}
				break;

			case 3: // ����
				System.out.println("������ Id�� �Է��ϼ���");
				id = sc.next();
				System.out.println("������ �̸��� �Է��ϼ���");
				name = sc.next();
				System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���");
				tel = sc.next();
				System.out.println("������ �ּҸ� �Է��ϼ���");
				addr = sc.next();

				MemberVo m2 = new MemberVo(id, name, tel, addr);
				service.updateMemberVo(m2);
				break;

			case 4: // ����
				System.out.println("������ Id�� �Է��ϼ���");
				id = sc.next();
				service.deleteMemberVO(id);
				break;

			case 5: // ���
				service.printAll();
				break;

			case 6: // ����
				System.out.println("�����մϴ�");
				flag = false;
				break;
			}
		}
	}
}